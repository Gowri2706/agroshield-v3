package com.agroshield.v3;

import android.Manifest;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.agroshield.v3.audio.AudioRecorderHelper;
import com.agroshield.v3.audio.WavFileWriter;
import com.agroshield.v3.net.ApiClient;

import java.io.IOException;

/**
 * ============================================================
 * AnimalDetectionActivity.java  (ONLINE version)
 * ============================================================
 * Pipeline ippo idhu:
 *
 *   1. Mic la 5 seconds record pannum        (AudioRecorderHelper - unchanged)
 *   2. Waveform ah WAV file bytes ah convert pannும்         (WavFileWriter)
 *   3. FastAPI server ku HTTP POST multipart upload pannும்   (ApiClient)
 *   4. Server-oda JSON response {"animal":..,"confidence":..} parse pannும்
 *   5. Result screen la kaatும்
 *
 * Phone-la TensorFlow Lite/YAMNet EDHUM run aagathu ippo - ella
 * ML processing um FastAPI server-la nடakkும் (app.py, ml_training/
 * animal_detection/server/).
 * ============================================================
 */
public class AnimalDetectionActivity extends AppCompatActivity {

    /**
     * ⚠️ FastAPI server URL idha unga setup-ku maathunga:
     *   - Android EMULATOR use pannina:  http://10.0.2.2:8000/predict
     *   - Real phone (same WiFi) use pannina: http://<PC-oda-LAN-IP>:8000/predict
     *     (e.g. http://192.168.1.5:8000/predict - "ipconfig"/"ifconfig" la PC IP paarunga)
     */
    private static final String SERVER_URL = "http://10.0.2.2:8000/predict";

    private TextView tvStatus, tvResult;
    private LinearLayout resultCard;
    private ProgressBar progressBar;
    private Button btnRecord;

    private boolean isBusy = false;

    private final ActivityResultLauncher<String> permissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(), granted -> {
                if (granted) {
                    startRecordingFlow();
                } else {
                    Toast.makeText(this, R.string.permission_denied, Toast.LENGTH_SHORT).show();
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detection);

        tvStatus = findViewById(R.id.tvStatus);
        tvResult = findViewById(R.id.tvResult);
        resultCard = findViewById(R.id.resultCard);
        progressBar = findViewById(R.id.progressBar);
        btnRecord = findViewById(R.id.btnRecord);

        ((android.widget.TextView) findViewById(R.id.tvHeaderTitle)).setText(R.string.feature_animal_title);
        ((android.widget.TextView) findViewById(R.id.tvHeaderSubtitle)).setText("Mic recording · Species ID");
        findViewById(R.id.btnHeaderBack).setOnClickListener(v -> finish());
        com.agroshield.v3.utils.TabBarHelper.setup(this, com.agroshield.v3.utils.TabBarHelper.Tab.ANIMAL);

        tvStatus.setText(R.string.animal_ready);

        btnRecord.setOnClickListener(v -> {
            if (isBusy) return;
            if (AudioRecorderHelper.hasPermission(this)) {
                startRecordingFlow();
            } else {
                permissionLauncher.launch(Manifest.permission.RECORD_AUDIO);
            }
        });
    }

    private void startRecordingFlow() {
        isBusy = true;
        btnRecord.setEnabled(false);
        resultCard.setVisibility(android.view.View.GONE);
        tvStatus.setText(R.string.animal_recording);

        new Thread(() -> {
            // ⚠️ SAFETY NET: real phone-la mic hardware / OS quirk edhavadhu
            // irundhu AudioRecorderHelper (illa WavFileWriter / ApiClient)
            // uள்ள edhavadhு exception throw pannா, background Thread-la
            // catch pannaama vittা, andha exception WHOLE APP-ஐயே crash
            // pannிடும் ("keeps stopping"). Idha thaduka, MUZHU runnable-ஐயும்
            // try/catch(Throwable) pannirukom - crash aagatha, Toast kaatும்.
            try {
                if (!AudioRecorderHelper.hasPermission(this)) {
                    runOnUiThread(() -> {
                        resetState();
                        Toast.makeText(this, R.string.permission_denied, Toast.LENGTH_SHORT).show();
                    });
                    return;
                }

                AudioRecorderHelper.recordClip(this, new AudioRecorderHelper.RecordingCallback() {
                    @Override
                    public void onFinished(float[] waveform) {
                        uploadAndPredict(waveform);
                    }

                    @Override
                    public void onError(String message) {
                        runOnUiThread(() -> {
                            resetState();
                            Toast.makeText(AnimalDetectionActivity.this, message, Toast.LENGTH_SHORT).show();
                        });
                    }
                });

            } catch (Throwable t) {
                // recordClip/WavFileWriter/ApiClient edhu la irundhalum
                // vandha edhu venuna exception-um inga safe-ah catch aagும்
                runOnUiThread(() -> {
                    resetState();
                    Toast.makeText(this,
                            "Recording error: " + t.getClass().getSimpleName()
                                    + (t.getMessage() != null ? " - " + t.getMessage() : ""),
                            Toast.LENGTH_LONG).show();
                });
            }
        }).start();
    }

    private void resetState() {
        isBusy = false;
        btnRecord.setEnabled(true);
        progressBar.setVisibility(android.view.View.GONE);
        tvStatus.setText(R.string.animal_ready);
    }

    /**
     * Already on a background thread (called from recordClip's onFinished).
     * WAV ah build panni, server ku upload panni, result kaatும்.
     */
    private void uploadAndPredict(float[] waveform) {
        runOnUiThread(() -> {
            progressBar.setVisibility(android.view.View.VISIBLE);
            tvStatus.setText(R.string.animal_uploading);
        });

        try {
            byte[] wavBytes = WavFileWriter.writeWavBytes(waveform, AudioRecorderHelper.SAMPLE_RATE);
            ApiClient.ApiResult result = ApiClient.uploadWav(SERVER_URL, wavBytes);

            String resultText = String.format("%s - %.1f%%", result.animal, result.confidence);

            runOnUiThread(() -> {
                resultCard.setVisibility(android.view.View.VISIBLE);
                tvResult.setText(resultText);
                resetState();
            });

        } catch (IOException e) {
            runOnUiThread(() -> {
                resetState();
                Toast.makeText(this, getString(R.string.server_error) + "\n" + e.getMessage(), Toast.LENGTH_LONG).show();
            });
        } catch (Throwable t) {
            // WavFileWriter la edhavadhu unexpected error vandha, inga
            // safe-ah catch aagும் - app crash aagathu
            runOnUiThread(() -> {
                resetState();
                Toast.makeText(this,
                        "Upload error: " + t.getClass().getSimpleName()
                                + (t.getMessage() != null ? " - " + t.getMessage() : ""),
                        Toast.LENGTH_LONG).show();
            });
        }
    }
}
