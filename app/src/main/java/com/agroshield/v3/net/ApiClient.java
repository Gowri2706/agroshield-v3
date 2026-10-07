package com.agroshield.v3.net;

import org.json.JSONObject;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;

/**
 * ============================================================
 * ApiClient.java
 * ============================================================
 * FastAPI /predict endpoint ku WAV file ah multipart/form-data ah
 * POST pannuthu (Retrofit/OkHttp illama, plain HttpURLConnection
 * mூலம் - extra gradle dependency venaam).
 *
 * Idha background thread la irundhu tha call pannanum (network call).
 * ============================================================
 */
public class ApiClient {

    private static final String TWO_HYPHENS = "--";
    private static final String LINE_END = "\r\n";
    private static final int TIMEOUT_MS = 30000;

    public static class ApiResult {
        public final String animal;
        public final double confidence;

        public ApiResult(String animal, double confidence) {
            this.animal = animal;
            this.confidence = confidence;
        }
    }

    public static class SensorReading {
        public final double soilMoisture;
        public final double temperature;
        public final double humidity;

        public SensorReading(double soilMoisture, double temperature, double humidity) {
            this.soilMoisture = soilMoisture;
            this.temperature = temperature;
            this.humidity = humidity;
        }
    }

    /**
     * GET /sensor-data — ESP32 Smart Owl (DHT22 + soil probe) chumma
     * post pannitu irukura latest reading ah fetch pannுthu.
     * @param serverUrl e.g. "http://192.168.1.5:8000/sensor-data"
     */
    public static SensorReading fetchSensorData(String serverUrl) throws IOException {
        HttpURLConnection conn = null;
        try {
            URL url = new URL(serverUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(TIMEOUT_MS);
            conn.setReadTimeout(TIMEOUT_MS);
            conn.setRequestMethod("GET");

            int status = conn.getResponseCode();
            String body = readAll(status >= 200 && status < 300 ? conn.getInputStream() : conn.getErrorStream());

            if (status < 200 || status >= 300) {
                throw new IOException("Server error (" + status + "): " + body);
            }

            JSONObject json = new JSONObject(body);
            if (json.isNull("soil_moisture") || json.isNull("temperature") || json.isNull("humidity")) {
                throw new IOException("Device innum edhavum data anuppala (updated_at null)");
            }

            return new SensorReading(
                    json.getDouble("soil_moisture"),
                    json.getDouble("temperature"),
                    json.getDouble("humidity"));

        } catch (Exception e) {
            throw new IOException("Fetch failed: " + e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    /**
     * @param serverUrl full URL, e.g. "http://192.168.1.5:8000/predict"
     * @param wavBytes  complete WAV file bytes (WavFileWriter output)
     */
    public static ApiResult uploadWav(String serverUrl, byte[] wavBytes) throws IOException {
        String boundary = "AgroShield-" + UUID.randomUUID();
        HttpURLConnection conn = null;

        try {
            URL url = new URL(serverUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(TIMEOUT_MS);
            conn.setReadTimeout(TIMEOUT_MS);
            conn.setDoOutput(true);
            conn.setUseCaches(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

            try (DataOutputStream request = new DataOutputStream(conn.getOutputStream())) {
                request.writeBytes(TWO_HYPHENS + boundary + LINE_END);
                request.writeBytes("Content-Disposition: form-data; name=\"file\"; filename=\"clip.wav\"" + LINE_END);
                request.writeBytes("Content-Type: audio/wav" + LINE_END);
                request.writeBytes(LINE_END);
                request.write(wavBytes);
                request.writeBytes(LINE_END);
                request.writeBytes(TWO_HYPHENS + boundary + TWO_HYPHENS + LINE_END);
            }

            int status = conn.getResponseCode();
            InputStream stream = (status >= 200 && status < 300) ? conn.getInputStream() : conn.getErrorStream();
            String body = readAll(stream);

            if (status < 200 || status >= 300) {
                throw new IOException("Server error (" + status + "): " + body);
            }

            JSONObject json = new JSONObject(body);
            return new ApiResult(json.getString("animal"), json.getDouble("confidence"));

        } catch (Exception e) {
            throw new IOException("Upload failed: " + e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    private static String readAll(InputStream in) throws IOException {
        if (in == null) return "";
        StringBuilder sb = new StringBuilder();
        byte[] buffer = new byte[4096];
        int n;
        while ((n = in.read(buffer)) != -1) {
            sb.append(new String(buffer, 0, n, "UTF-8"));
        }
        in.close();
        return sb.toString();
    }
}
