package com.agroshield.v3.ml;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;

import org.tensorflow.lite.Interpreter;
import org.tensorflow.lite.support.common.FileUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * ============================================================
 * TFLiteClassifier.java
 * ============================================================
 * Idhu oru COMMON (reusable) class - Animal Detection kum,
 * Plant Diagnosis kum inda class ah tha use pannuvom.
 * Only difference: .tflite file name + labels.txt file name.
 *
 * Eppadi vela pannum:
 *  1. assets folder la irukura .tflite model ah load pannum
 *  2. Camera photo ah 224x224 size ku resize pannum
 *  3. Model ku kudukum -> output probability list kidaikum
 *  4. Athula max probability irukura label ah return pannum
 *
 * IMPORTANT: 100% accuracy nu solla mudiyathu edhuvum. Ana,
 * confidence score kudukurom (Example: "Cow - 96.4% confidence")
 * so user ku transparent ah theriyum evlo sure nu.
 * ============================================================
 */
public class TFLiteClassifier {

    private Interpreter interpreter;
    private List<String> labels;
    private static final int IMAGE_SIZE = 224; // training la use panna size same ah irukanum
    private static final int NUM_CHANNELS = 3; // RGB
    private static final int NUM_BYTES_PER_CHANNEL = 4; // float32

    public TFLiteClassifier(Context context, String modelFileName, String labelFileName) throws IOException {
        interpreter = new Interpreter(loadModelFile(context, modelFileName));
        labels = FileUtil.loadLabels(context, labelFileName);
    }

    // assets folder ilirundhu .tflite file ah memory ku load pannum
    private MappedByteBuffer loadModelFile(Context context, String modelFileName) throws IOException {
        AssetFileDescriptor fileDescriptor = context.getAssets().openFd(modelFileName);
        FileInputStream inputStream = new FileInputStream(fileDescriptor.getFileDescriptor());
        FileChannel fileChannel = inputStream.getChannel();
        long startOffset = fileDescriptor.getStartOffset();
        long declaredLength = fileDescriptor.getDeclaredLength();
        return fileChannel.map(FileChannel.MapMode.READ_ONLY, startOffset, declaredLength);
    }

    // Bitmap image ah model ku puriyura format (ByteBuffer) ku convert pannum
    private ByteBuffer convertBitmapToByteBuffer(Bitmap bitmap) {
        Bitmap resized = Bitmap.createScaledBitmap(bitmap, IMAGE_SIZE, IMAGE_SIZE, true);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(NUM_BYTES_PER_CHANNEL * IMAGE_SIZE * IMAGE_SIZE * NUM_CHANNELS);
        byteBuffer.order(ByteOrder.nativeOrder());

        int[] pixels = new int[IMAGE_SIZE * IMAGE_SIZE];
        resized.getPixels(pixels, 0, IMAGE_SIZE, 0, 0, IMAGE_SIZE, IMAGE_SIZE);

        for (int pixel : pixels) {
            // 0-255 pixel value ah 0-1 range ku normalize pannurom (training la um idhe mathiri pannanum)
            byteBuffer.putFloat(((pixel >> 16) & 0xFF) / 255.0f); // Red
            byteBuffer.putFloat(((pixel >> 8) & 0xFF) / 255.0f);  // Green
            byteBuffer.putFloat((pixel & 0xFF) / 255.0f);         // Blue
        }
        return byteBuffer;
    }

    /**
     * Main prediction function.
     * Return pannum: List of "Label - XX.X%" sorted by highest confidence first.
     */
    public List<String> classify(Bitmap bitmap) {
        ByteBuffer inputBuffer = convertBitmapToByteBuffer(bitmap);
        float[][] output = new float[1][labels.size()];
        interpreter.run(inputBuffer, output);

        List<Result> results = new ArrayList<>();
        for (int i = 0; i < labels.size(); i++) {
            results.add(new Result(labels.get(i), output[0][i]));
        }
        // Highest confidence first
        results.sort((a, b) -> Float.compare(b.confidence, a.confidence));

        List<String> finalOutput = new ArrayList<>();
        for (Result r : results) {
            finalOutput.add(String.format("%s - %.1f%%", r.label, r.confidence * 100));
        }
        return finalOutput;
    }

    // Top-1 result mattum venumna idha use pannunga
    public Result classifyTop1(Bitmap bitmap) {
        ByteBuffer inputBuffer = convertBitmapToByteBuffer(bitmap);
        float[][] output = new float[1][labels.size()];
        interpreter.run(inputBuffer, output);

        int bestIndex = 0;
        float bestScore = 0f;
        for (int i = 0; i < output[0].length; i++) {
            if (output[0][i] > bestScore) {
                bestScore = output[0][i];
                bestIndex = i;
            }
        }
        return new Result(labels.get(bestIndex), bestScore);
    }

    public void close() {
        if (interpreter != null) interpreter.close();
    }

    public static class Result {
        public String label;
        public float confidence;
        public Result(String label, float confidence) {
            this.label = label;
            this.confidence = confidence;
        }
    }
}
