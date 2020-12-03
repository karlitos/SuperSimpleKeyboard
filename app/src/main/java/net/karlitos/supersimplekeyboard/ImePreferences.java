package net.karlitos.supersimplekeyboard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import static android.preference.PreferenceActivity.EXTRA_NO_HEADERS;
import static android.preference.PreferenceActivity.EXTRA_SHOW_FRAGMENT;


/**
 * Displays the IME preferences inside the input method setting.
 */
public class ImePreferences extends AppCompatActivity {
    @Override
    public Intent getIntent() {
        final Intent modIntent = new Intent(super.getIntent());
        modIntent.putExtra(EXTRA_SHOW_FRAGMENT, Settings.class.getName());
        modIntent.putExtra(EXTRA_NO_HEADERS, true);
        return modIntent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // We overwrite the title of the activity, as the default one is "Voice Search".
        setTitle(R.string.settings_name);
    }

    /*protected boolean isValidFragment(final String fragmentName) {
        return Settings.class.getName().equals(fragmentName);
    }*/
    public static class Settings extends InputMethodSettingsFragment {
        /*@Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.ime_preferences);
            //setInputMethodSettingsCategoryTitle(R.string.layout_selection_title);
            //setSubtypeEnablerTitle(R.string.select_layout);
        }*/

        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            super.onCreatePreferences(savedInstanceState, rootKey);
            // Load the preferences from an XML resource
            //setPreferencesFromResource(R.xml.ime_preferences, rootKey);
            addPreferencesFromResource(R.xml.ime_preferences);
            //setPreferencesFromResource(R.xml.ime_preferences, rootKey);
        }
    }
}
