package com.agroshield.v3.utils;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;

import com.agroshield.v3.AnimalDetectionActivity;
import com.agroshield.v3.MainActivity;
import com.agroshield.v3.PlantDiagnosisActivity;
import com.agroshield.v3.R;
import com.agroshield.v3.SoilHumidityActivity;

/**
 * ============================================================
 * TabBarHelper.java
 * ============================================================
 * tabbar.xml (<include>) ah ovvoru Activity-லேயும் wire panna
 * idha oru இடத்துல mattum handle pannுthu - so tabbar logic
 * 4 activities-லும் duplicate aagathu, oru edit sufficient.
 *
 * Usage (Activity onCreate-la, setContentView appuram):
 *   TabBarHelper.setup(this, TabBarHelper.Tab.ANIMAL);
 * ============================================================
 */
public class TabBarHelper {

    public enum Tab { ANIMAL, SOIL, PLANT, HOME }

    public static void setup(Activity activity, Tab current) {
        activity.findViewById(R.id.tabAnimal).setOnClickListener(v ->
                navigateTo(activity, AnimalDetectionActivity.class, current, Tab.ANIMAL));

        activity.findViewById(R.id.tabSoil).setOnClickListener(v ->
                navigateTo(activity, SoilHumidityActivity.class, current, Tab.SOIL));

        activity.findViewById(R.id.tabPlant).setOnClickListener(v ->
                navigateTo(activity, PlantDiagnosisActivity.class, current, Tab.PLANT));

        activity.findViewById(R.id.tabHome).setOnClickListener(v ->
                navigateTo(activity, MainActivity.class, current, Tab.HOME));

        highlight(activity, current);
    }

    private static void navigateTo(Activity activity, Class<?> target, Tab current, Tab tapped) {
        if (current == tapped) return; // already on this screen
        activity.startActivity(new Intent(activity, target));
        activity.finish();
    }

    private static void highlight(Activity activity, Tab active) {
        setTabColor(activity, R.id.tabAnimalIcon, R.id.tabAnimalLabel, active == Tab.ANIMAL);
        setTabColor(activity, R.id.tabSoilIcon, R.id.tabSoilLabel, active == Tab.SOIL);
        setTabColor(activity, R.id.tabPlantIcon, R.id.tabPlantLabel, active == Tab.PLANT);
        setTabColor(activity, R.id.tabHomeIcon, R.id.tabHomeLabel, active == Tab.HOME);
    }

    private static void setTabColor(Activity activity, int iconId, int labelId, boolean isActive) {
        int color = isActive
                ? activity.getResources().getColor(R.color.primary_green)
                : activity.getResources().getColor(R.color.text_light3);
        ((TextView) activity.findViewById(labelId)).setTextColor(color);
    }
}
