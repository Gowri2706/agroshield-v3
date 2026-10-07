package com.agroshield.v3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.agroshield.v3.utils.LocaleHelper;

/**
 * Language select panna screen.
 * Button click pannina, LocaleHelper vachi app language ah maathi,
 * MainActivity ku thirumba pogum.
 */
public class LanguageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);

        findViewById(R.id.btnEnglish).setOnClickListener(v -> selectLanguage("en"));
        findViewById(R.id.btnTamil).setOnClickListener(v -> selectLanguage("ta"));
        findViewById(R.id.btnHindi).setOnClickListener(v -> selectLanguage("hi"));
    }

    private void selectLanguage(String code) {
        LocaleHelper.setAppLanguage(this, code);
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}
