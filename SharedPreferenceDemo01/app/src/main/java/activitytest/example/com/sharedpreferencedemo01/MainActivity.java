package activitytest.example.com.sharedpreferencedemo01;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences pref=getSharedPreferences("myPref",MODE_PRIVATE);
        SharedPreferences.Editor editor=pref.edit();
        editor.putString("name","张三");
        editor.putInt("age",30);
        editor.putLong("time",System.currentTimeMillis());
        editor.putBoolean("default",true);
        editor.commit();
        editor.remove("default");
        editor.commit();
    }
}
