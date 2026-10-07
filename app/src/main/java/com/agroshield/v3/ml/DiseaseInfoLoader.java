package com.agroshield.v3.ml;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * DiseaseInfoLoader.java
 * ============================================================
 * assets/disease_info.json file ah padichu, Map<ClassName, DiseaseInfo>
 * ah kudukkum. Idha use panni, model predict panna class name (e.g.
 * "Tomato___Early_blight") vachi, full bilingual details (name,
 * description, solution) eduthukalam.
 * ============================================================
 */
public class DiseaseInfoLoader {

    public static Map<String, DiseaseInfo> load(Context context, String fileName) throws IOException, JSONException {
        Map<String, DiseaseInfo> map = new HashMap<>();

        InputStream is = context.getAssets().open(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        reader.close();

        JSONObject root = new JSONObject(sb.toString());
        java.util.Iterator<String> keys = root.keys();
        while (keys.hasNext()) {
            String classKey = keys.next();
            JSONObject obj = root.getJSONObject(classKey);
            DiseaseInfo info = new DiseaseInfo(
                    classKey,
                    obj.optString("name_en", classKey),
                    obj.optString("name_ta", classKey),
                    obj.optString("description_en", ""),
                    obj.optString("description_ta", ""),
                    obj.optString("solution_en", ""),
                    obj.optString("solution_ta", "")
            );
            map.put(classKey, info);
        }
        return map;
    }
}
