package com.agroshield.v3.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.LocaleList;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.os.LocaleListCompat;

/**
 * ============================================================
 * LocaleHelper.java
 * App full ah language maathrathukku idha use pannuvom.
 * "en" = English, "ta" = Tamil, "hi" = Hindi
 *
 * Eppadi use pannurathu:
 *   LocaleHelper.setAppLanguage(activity, "ta");   -> Tamil ku maarum
 *   LocaleHelper.setAppLanguage(activity, "en");   -> English ku maarum
 * ============================================================
 */
public class LocaleHelper {

    private static final String PREFS_NAME = "agroshield_prefs";
    private static final String KEY_LANGUAGE = "selected_language";

    // Selected language ah save pannuvom (SharedPreferences la)
    public static void saveLanguagePref(Context context, String langCode) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        prefs.edit().putString(KEY_LANGUAGE, langCode).apply();
    }

    public static String getSavedLanguage(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return prefs.getString(KEY_LANGUAGE, "en"); // default English
    }

    // Idhu tha main function - app language ah maathrathu
    public static void setAppLanguage(Activity activity, String langCode) {
        saveLanguagePref(activity, langCode);
        LocaleListCompat appLocale = LocaleListCompat.forLanguageTags(langCode);
        AppCompatDelegate.setApplicationLocales(appLocale);
    }

    // App start aagumbodhu already save panna language ah apply pannanum
    public static void applySavedLanguage(Context context) {
        String saved = getSavedLanguage(context);
        LocaleListCompat appLocale = LocaleListCompat.forLanguageTags(saved);
        AppCompatDelegate.setApplicationLocales(appLocale);
    }
}
