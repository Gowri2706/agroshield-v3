package com.agroshield.v3.audio;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import androidx.core.content.ContextCompat;

/**
 * ============================================================
 * AudioRecorderHelper.java
 * ============================================================
 * Mic la irundhu 5 seconds audio record pannum, 16kHz mono
 * float samples (-1.0 to +1.0 range) ah kudukkum.
 *
 * Idhu unga "preprocessed.py" script pannura VENDHA vela ah tha
 * pannuthu (16kHz, mono, 5 sec, [-1,1] normalized) - PC la neenga
 * training ku files ah eppadi prepare pannaninga, phone-la real
 * time-la adhe mathiri prepare pannurom, so model ku "match aana"
 * input tha kidaikum.
 * ============================================================
 */
public class AudioRecorderHelper {

    public static final int SAMPLE_RATE = 16000;         // unga train.py/preprocessed.py oda SAMPLE_RATE
    public static final int CLIP_DURATION_SEC = 5;         // unga preprocessed.py oda CLIP_DURATION
    public static final int TARGET_LENGTH = SAMPLE_RATE * CLIP_DURATION_SEC; // 80,000 samples

    public interface RecordingCallback {
        void onFinished(float[] waveform);
        void onError(String message);
    }

    public static boolean hasPermission(Context context) {
        return ContextCompat.checkSelfPermission(context, Manifest.permission.RECORD_AUDIO)
                == PackageManager.PERMISSION_GRANTED;
    }

    /**
     * 5 seconds record pannum (blocking - background thread la call pannunga).
     * Recording mudinjadhum, exactly TARGET_LENGTH samples (padded/truncated,
     * unga preprocessed.py process_audio() function mathiri) return pannum.
     */
    public static void recordClip(Context context, RecordingCallback callback) {
        if (!hasPermission(context)) {
            callback.onError("RECORD_AUDIO permission illa");
            return;
        }

        int minBufferSize = AudioRecord.getMinBufferSize(
                SAMPLE_RATE, AudioFormat.CHANNEL_IN_MONO, AudioFormat.ENCODING_PCM_16BIT);

        if (minBufferSize <= 0) {
            callback.onError("Device audio config error");
            return;
        }

        AudioRecord recorder;
        try {
            recorder = new AudioRecord(
                    MediaRecorder.AudioSource.MIC,
                    SAMPLE_RATE,
                    AudioFormat.CHANNEL_IN_MONO,
                    AudioFormat.ENCODING_PCM_16BIT,
                    Math.max(minBufferSize, TARGET_LENGTH) * 2 // safety margin
            );
        } catch (SecurityException e) {
            callback.onError("Mic permission denied");
            return;
        }

        if (recorder.getState() != AudioRecord.STATE_INITIALIZED) {
            callback.onError("AudioRecord init failed");
            return;
        }

        short[] rawBuffer = new short[TARGET_LENGTH];
        recorder.startRecording();

        int totalRead = 0;
        while (totalRead < TARGET_LENGTH) {
            int read = recorder.read(rawBuffer, totalRead, TARGET_LENGTH - totalRead);
            if (read > 0) {
                totalRead += read;
            } else {
                break; // error or no more data
            }
        }

        recorder.stop();
        recorder.release();

        // short (-32768..32767) -> float (-1.0..+1.0), same range librosa.load() gives
        float[] waveform = new float[TARGET_LENGTH];
        for (int i = 0; i < TARGET_LENGTH; i++) {
            waveform[i] = rawBuffer[i] / 32768.0f;
        }

        callback.onFinished(waveform);
    }
}
