package com.agroshield.v3;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.*;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import com.agroshield.v3.ml.DiseaseInfo;
import com.agroshield.v3.ml.DiseaseInfoLoader;
import com.agroshield.v3.ml.TFLiteClassifier;
import com.agroshield.v3.utils.LocaleHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * ============================================================
 * PlantDiagnosisActivity.java
 * ============================================================
 * REAL trained model use pannurom (38 classes, PlantVillage-based):
 *   assets/plant_model.tflite   - trained model
 *   assets/plant_labels.txt     - 38 class names (correct order)
 *   assets/disease_info.json    - bilingual (EN/TA) name+desc+solution
 *
 * SAFETY LOGIC (same as predict.py on PC):
 *   Model top confidence < 60% -> "This is not a plant / image unclear"
 *   nu solli, wrong disease name kaatama irukurom.
 * ============================================================
 */
public class PlantDiagnosisActivity extends AppCompatActivity {

    private static final float CONFIDENCE_THRESHOLD = 0.60f;

    private ImageView imgPreview;
    private TextView tvResult;
    private LinearLayout resultCard;
    private ProgressBar progressBar;
    private Bitmap currentBitmap;
    private TFLiteClassifier classifier;
    private Map<String, DiseaseInfo> diseaseInfoMap;
    private String appLang = "en";

    private final ActivityResultLauncher<Void> cameraLauncher =
            registerForActivityResult(new ActivityResultContracts.TakePicturePreview(), bitmap -> {
                if (bitmap != null) {
                    currentBitmap = bitmap;
                    imgPreview.setImageBitmap(bitmap);
                    resultCard.setVisibility(android.view.View.GONE);
                }
            });

    private final ActivityResultLauncher<String> galleryLauncher =
            registerForActivityResult(new ActivityResultContracts.GetContent(), uri -> {
                if (uri != null) {
                    try {
                        Bitmap bmp = loadBitmapFromUri(uri);
                        currentBitmap = bmp;
                        imgPreview.setImageBitmap(bmp);
                        resultCard.setVisibility(android.view.View.GONE);
                    } catch (IOException e) {
                        Toast.makeText(this, "Image load error: " + e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });

    private final ActivityResultLauncher<String> permissionLauncher =
            registerForActivityResult(new ActivityResultContracts.RequestPermission(), granted -> {
                if (granted) {
                    cameraLauncher.launch(null);
                } else {
                    Toast.makeText(this, R.string.permission_denied, Toast.LENGTH_SHORT).show();
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detection);

        ((TextView) findViewById(R.id.tvHeaderTitle)).setText(R.string.feature_plant_title);
        ((TextView) findViewById(R.id.tvHeaderSubtitle)).setText("AI-powered disease detection");
        findViewById(R.id.btnHeaderBack).setOnClickListener(v -> finish());
        com.agroshield.v3.utils.TabBarHelper.setup(this, com.agroshield.v3.utils.TabBarHelper.Tab.PLANT);

        imgPreview = findViewById(R.id.imgPreview);
        tvResult = findViewById(R.id.tvResult);
        resultCard = findViewById(R.id.resultCard);
        progressBar = findViewById(R.id.progressBar);

        appLang = LocaleHelper.getSavedLanguage(this); // "en" / "ta" / "hi"

        // Model + labels load pannurom (app start la oru thadava mattum)
        try {
            classifier = new TFLiteClassifier(this, "plant_model.tflite", "plant_labels.txt");
        } catch (IOException e) {
            Toast.makeText(this, "Model missing! Check assets/plant_model.tflite", Toast.LENGTH_LONG).show();
        }

        // Bilingual disease info (name/description/solution) load pannurom
        try {
            diseaseInfoMap = DiseaseInfoLoader.load(this, "disease_info.json");
        } catch (Exception e) {
            Toast.makeText(this, "disease_info.json missing/invalid", Toast.LENGTH_LONG).show();
        }

        findViewById(R.id.btnCapture).setOnClickListener(v ->
                permissionLauncher.launch(android.Manifest.permission.CAMERA));

        findViewById(R.id.btnGallery).setOnClickListener(v -> galleryLauncher.launch("image/*"));

        findViewById(R.id.btnAnalyze).setOnClickListener(v -> runPrediction());
    }

    private Bitmap loadBitmapFromUri(Uri uri) throws IOException {
        InputStream is = getContentResolver().openInputStream(uri);
        Bitmap bmp = android.graphics.BitmapFactory.decodeStream(is);
        if (is != null) is.close();
        return bmp;
    }

    private void runPrediction() {
        if (currentBitmap == null) {
            Toast.makeText(this, "Photo eduka / select pannunga first", Toast.LENGTH_SHORT).show();
            return;
        }
        if (classifier == null) {
            Toast.makeText(this, "Model not loaded.", Toast.LENGTH_LONG).show();
            return;
        }

        progressBar.setVisibility(android.view.View.VISIBLE);
        resultCard.setVisibility(android.view.View.GONE);

        // Background thread la run pannurom, UI hang aagama irukanum
        new Thread(() -> {
            TFLiteClassifier.Result top = classifier.classifyTop1(currentBitmap);
            String finalText = buildResultText(top);

            runOnUiThread(() -> {
                progressBar.setVisibility(android.view.View.GONE);
                resultCard.setVisibility(android.view.View.VISIBLE);
                tvResult.setText(finalText);
            });
        }).start();
    }

    /**
     * predict.py oda EXACT SAME logic:
     * confidence < 60% na "not a plant / unclear image" solluvom,
     * wrong disease name kaatamal.
     */
    private String buildResultText(TFLiteClassifier.Result top) {
        if (top.confidence < CONFIDENCE_THRESHOLD) {
            if (appLang.equals("ta")) {
                return "⚠️ இது ஒரு தாவரம் இல்லை (அல்லது படம் தெளிவாக இல்லை).\n" +
                        "தயவுசெய்து இலையை நெருக்கமாக, தெளிவான வெளிச்சத்தில் புகைப்படம் எடுக்கவும்.\n\n" +
                        String.format("(confidence: %.1f%%)", top.confidence * 100);
            }
            return "⚠️ This does not look like a plant leaf (or image is unclear).\n" +
                    "Please take a clear, close-up photo of the leaf in good light.\n\n" +
                    String.format("(confidence: %.1f%%)", top.confidence * 100);
        }

        DiseaseInfo info = diseaseInfoMap != null ? diseaseInfoMap.get(top.label) : null;
        StringBuilder sb = new StringBuilder();

        String name = top.label;
        String desc = "";
        String solution = "";

        if (info != null) {
            if (appLang.equals("ta")) {
                name = info.nameTa;
                desc = info.descriptionTa;
                solution = info.solutionTa;
            } else { // en or hi (disease info has no hi text, fallback to en)
                name = info.nameEn;
                desc = info.descriptionEn;
                solution = info.solutionEn;
            }
        }

        boolean healthy = info != null && info.isHealthy();

        sb.append(healthy ? "✅ " : "🔴 ").append(name)
                .append(String.format("  (%.1f%%)\n\n", top.confidence * 100));

        if (!desc.isEmpty()) {
            sb.append(appLang.equals("ta") ? "விவரம்: " : "Details: ").append(desc).append("\n\n");
        }
        if (!healthy && !solution.isEmpty()) {
            sb.append(appLang.equals("ta") ? "தீர்வு: " : "Solution: ").append(solution);
        }

        return sb.toString();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (classifier != null) classifier.close();
    }
}
