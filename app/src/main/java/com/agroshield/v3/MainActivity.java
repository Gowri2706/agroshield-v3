package com.agroshield.v3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.agroshield.v3.utils.LocaleHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        LocaleHelper.applySavedLanguage(this);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViewById(R.id.cardAnimal).setOnClickListener(v ->
                startActivity(new Intent(this, AnimalDetectionActivity.class)));

        findViewById(R.id.cardPlant).setOnClickListener(v ->
                startActivity(new Intent(this, PlantDiagnosisActivity.class)));

        findViewById(R.id.cardSoil).setOnClickListener(v ->
                startActivity(new Intent(this, SoilHumidityActivity.class)));

        findViewById(R.id.btnLanguage).setOnClickListener(v ->
                startActivity(new Intent(this, LanguageActivity.class)));

        com.agroshield.v3.utils.TabBarHelper.setup(
                this,
                com.agroshield.v3.utils.TabBarHelper.Tab.HOME
        );
    }
}