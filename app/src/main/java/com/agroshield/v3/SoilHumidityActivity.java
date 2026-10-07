package com.agroshield.v3;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.agroshield.v3.ml.SoilPredictor;
import com.agroshield.v3.net.ApiClient;

import java.io.IOException;

/**
 * ============================================================
 * SoilHumidityActivity.java
 * ============================================================
 * Idhu Animal/Plant screen mathiri camera/ML model use pannala.
 * Ithuku ML model illama, AGRICULTURE SCIENCE THRESHOLD RULES vachi
 * (standard soil-science guidelines) advisory kudukurom.
 * Reason: soil moisture/humidity/temp/pH ku fixed "correct" science
 * based ranges already irukku (idhu 100% reliable, ML predict pannina
 * kooda idhe range dhan follow pannum), so rule-based tha best +
 * fastest + most accurate approach.
 *
 * User future la real soil sensor (DHT11/Capacitive Soil Sensor)
 * Bluetooth mூலம் value anupanumna, andha value ah inga EditText ku
 * badhilu direct set pannalam (setText) - baaki logic same ah irukkum.
 * ============================================================
 */
public class SoilHumidityActivity extends AppCompatActivity {

    private EditText etMoisture, etHumidity, etTemp, etPh;
    private Spinner spinnerPlant;
    private LinearLayout resultCard, aiResultCard;
    private TextView tvResult, tvAiResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soil_humidity);

        etMoisture = findViewById(R.id.etMoisture);
        etHumidity = findViewById(R.id.etHumidity);
        etTemp = findViewById(R.id.etTemp);
        etPh = findViewById(R.id.etPh);
        spinnerPlant = findViewById(R.id.spinnerPlant);
        resultCard = findViewById(R.id.soilResultCard);
        tvResult = findViewById(R.id.tvSoilResult);
        aiResultCard = findViewById(R.id.aiResultCard);
        tvAiResult = findViewById(R.id.tvAiResult);

        ((TextView) findViewById(R.id.tvHeaderTitle)).setText(R.string.feature_soil_title);
        ((TextView) findViewById(R.id.tvHeaderSubtitle)).setText("Sensors · Irrigation advisory");
        findViewById(R.id.btnHeaderBack).setOnClickListener(v -> finish());
        com.agroshield.v3.utils.TabBarHelper.setup(this, com.agroshield.v3.utils.TabBarHelper.Tab.SOIL);

        ArrayAdapter<String> plantAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_item,
                SoilPredictor.getPlantList()
        ) {
            @Override
            public View getView(int position, View convertView, android.view.ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                TextView textView = (TextView) view.findViewById(android.R.id.text1);

                // Selected Plant name black color
                textView.setTextColor(Color.BLACK);

                return view;
            }
        };

        plantAdapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        spinnerPlant.setAdapter(plantAdapter);

        Button btnCheck = findViewById(R.id.btnCheckSoil);
        btnCheck.setOnClickListener(v -> analyzeSoil());

        Button btnFetchDevice = findViewById(R.id.btnFetchDevice);
        btnFetchDevice.setOnClickListener(v -> fetchFromDevice());
    }

    /**
     * ESP32 Smart Owl (DHT22 + soil probe) — FastAPI /sensor-data
     * endpoint la irundhu latest reading ah fetch panni, fields ah
     * auto-fill pannுthu. Same server (SoilHumidityActivity.SERVER_URL)
     * unga IP-ku maathunga.
     */
    private static final String SENSOR_URL = "http://10.0.2.2:8000/sensor-data";

    private void fetchFromDevice() {
        Toast.makeText(this, "Device data fetch pannuthu...", Toast.LENGTH_SHORT).show();
        new Thread(() -> {
            try {
                ApiClient.SensorReading reading = ApiClient.fetchSensorData(SENSOR_URL);
                runOnUiThread(() -> {
                    etMoisture.setText(String.valueOf(Math.round(reading.soilMoisture)));
                    etTemp.setText(String.valueOf(reading.temperature));
                    etHumidity.setText(String.valueOf(reading.humidity));
                    Toast.makeText(this, "Device data fill aayiduchu — Check Soil ah pannunga", Toast.LENGTH_SHORT).show();
                });
            } catch (IOException e) {
                runOnUiThread(() ->
                        Toast.makeText(this, "Device data fetch failed: " + e.getMessage(), Toast.LENGTH_LONG).show());
            }
        }).start();
    }

    private void analyzeSoil() {
        String sMoist = etMoisture.getText().toString().trim();
        String sHum = etHumidity.getText().toString().trim();
        String sTemp = etTemp.getText().toString().trim();
        String sPh = etPh.getText().toString().trim();

        if (sMoist.isEmpty() || sHum.isEmpty() || sTemp.isEmpty() || sPh.isEmpty()) {
            Toast.makeText(this, "Ella field-um nirappunga", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            float moisture = Float.parseFloat(sMoist);
            float humidity = Float.parseFloat(sHum);
            float temp = Float.parseFloat(sTemp);
            float ph = Float.parseFloat(sPh);

            StringBuilder result = new StringBuilder();

            // --- Soil Moisture check ---
            if (moisture < 20) {
                result.append("💧 Moisture: LOW — Urgent irrigation needed.\n\n");
            } else if (moisture <= 60) {
                result.append("💧 Moisture: GOOD — Ideal range for most crops.\n\n");
            } else {
                result.append("💧 Moisture: HIGH — Risk of root rot, reduce watering.\n\n");
            }

            // --- Humidity check ---
            if (humidity < 40) {
                result.append("🌫 Humidity: LOW — Crops may face water stress.\n\n");
            } else if (humidity <= 70) {
                result.append("🌫 Humidity: GOOD — Healthy range.\n\n");
            } else {
                result.append("🌫 Humidity: HIGH — Higher risk of fungal disease.\n\n");
            }

            // --- Temperature check ---
            if (temp < 15) {
                result.append("🌡 Temperature: LOW — Growth may slow down.\n\n");
            } else if (temp <= 35) {
                result.append("🌡 Temperature: GOOD — Suitable for most crops.\n\n");
            } else {
                result.append("🌡 Temperature: HIGH — Heat stress risk, consider shade/mulching.\n\n");
            }

            // --- Soil pH check ---
            if (ph < 5.5) {
                result.append("🧪 Soil pH: ACIDIC — Consider adding lime.\n\n");
            } else if (ph <= 7.5) {
                result.append("🧪 Soil pH: NEUTRAL — Ideal for most crops.\n\n");
            } else {
                result.append("🧪 Soil pH: ALKALINE — Consider adding sulfur/organic compost.\n\n");
            }

            resultCard.setVisibility(View.VISIBLE);
            tvResult.setText(result.toString());

            // --- AI Prediction (plant-specific, trained RandomForest model) ---
            String selectedPlant = (String) spinnerPlant.getSelectedItem();
            SoilPredictor.Result aiResult = SoilPredictor.predict(selectedPlant, moisture, temp, humidity);

            String aiText = "Plant: " + capitalize(selectedPlant) + "\n\n"
                    + "Prediction: " + aiResult.prediction + "\n"
                    + "Confidence: " + Math.round(aiResult.confidence * 100) + "%\n\n"
                    + aiResult.recommendation;

            aiResultCard.setVisibility(View.VISIBLE);
            tvAiResult.setText(aiText);

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Sariyaana number podunga", Toast.LENGTH_SHORT).show();
        }
    }

    private String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
