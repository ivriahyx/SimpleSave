package sg.edu.rp.c346.simplesave;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onPause() {
        super.onPause();

        //Step 1b: Obtain an instance of the shared preference
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //Step 1c: Obtain an instance of the Shared Preference Editor for update later
        SharedPreferences.Editor prefsEdit = prefs.edit();
        //Step 1d: Add the key-value pair
        prefsEdit.putString("greeting","Hello!");
        //Step 1e: Call commit() method to save the changes into Shared Preference
        prefsEdit.commit();

    }
    @Override
    protected void onResume() {
        super.onResume();

        //Step 2a: Obtain an instance of the Shared Preference
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //Step 2b: Retrieve the saved data with the key, greeting from the SharedPreferences object.
        String strGreeting = prefs.getString("greeting","No greetings!");

        Toast toast = Toast.makeText(getApplicationContext(),strGreeting, Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Thiis is a new line

    }
}
