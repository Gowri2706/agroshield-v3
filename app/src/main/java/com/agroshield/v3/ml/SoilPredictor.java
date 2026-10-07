package com.agroshield.v3.ml;

/**
 * ============================================================
 * SoilPredictor.java
 * ============================================================
 * Idhu backend/train.py la irundha scikit-learn RandomForest model ah
 * (soil_irrigation_model.pkl) Java code ah convert panni (m2cgen tool
 * mூலம்) idha offline-ah, phone-லேயே run panra wrapper class.
 *
 * Server venaam, internet venaam - ella logic-um phone-la irukkum.
 *
 * Input: plant name + soil moisture + temperature + humidity
 * Output: "Irrigation Required" / "Optimal" / "Overwatered" + confidence
 * ============================================================
 */
public class SoilPredictor {

    // OneHotEncoder categories_ order (train.py dataset la irundha alphabetical order)
    private static final String[] PLANTS = {
            "apple", "banana", "beans", "blackgram", "brinjal", "cabbage", "carrot",
            "cauliflower", "chickpea", "chilli", "coconut", "coffee", "cotton",
            "cucumber", "grapes", "jute", "kidneybeans", "lentil", "maize", "mango",
            "mothbeans", "mungbean", "muskmelon", "okra", "onion", "orange", "papaya",
            "pigeonpeas", "pomegranate", "potato", "rice", "spinach", "tomato",
            "watermelon"
    };

    private static final String[] CLASSES = {
            "Irrigation Required", "Optimal", "Overwatered"
    };

    public static class Result {
        public final String prediction;
        public final String recommendation;
        public final double confidence;

        public Result(String prediction, String recommendation, double confidence) {
            this.prediction = prediction;
            this.recommendation = recommendation;
            this.confidence = confidence;
        }
    }

    public static String[] getPlantList() {
        return PLANTS;
    }

    /**
     * @param plant     lowercase plant name, must be one of PLANTS (idhu
     *                  spinner-la irundhu varum-na already correct-ah irukkum)
     * @param moisture  soil moisture %
     * @param temperature temperature in Celsius
     * @param humidity  humidity %
     */
    public static Result predict(String plant, float moisture, float temperature, float humidity) {
        double[] input = new double[PLANTS.length + 3];

        String p = plant == null ? "" : plant.trim().toLowerCase();
        for (int i = 0; i < PLANTS.length; i++) {
            if (PLANTS[i].equals(p)) {
                input[i] = 1.0;
                break;
            }
        }
        // Ippove plant list la illana ella one-hot column-um 0 ah irukkum
        // (OneHotEncoder(handle_unknown="ignore") - training la panna adhu maadhiri)

        input[PLANTS.length] = moisture;
        input[PLANTS.length + 1] = temperature;
        input[PLANTS.length + 2] = humidity;

        double[] scores = SoilIrrigationModel.score(input);

        int bestIdx = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > scores[bestIdx]) bestIdx = i;
        }

        String prediction = CLASSES[bestIdx];
        String recommendation;
        switch (prediction) {
            case "Irrigation Required":
                recommendation = "Neraya thanni thevai - udanadiyaa irrigation pannunga.";
                break;
            case "Overwatered":
                recommendation = "Thanni adhigama irukku - irrigation kammi pannunga, root rot risk.";
                break;
            default:
                recommendation = "Plant condition nallaa irukku - ippo irukura maadhiri continue pannunga.";
        }

        return new Result(prediction, recommendation, scores[bestIdx]);
    }
}
