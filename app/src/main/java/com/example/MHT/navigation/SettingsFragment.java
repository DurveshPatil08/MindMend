package com.example.MHT.navigation;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;


import com.example.MHT.R;


public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
