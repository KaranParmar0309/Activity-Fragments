package com.example.activityfragments;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String tag = "Android Lifecycle Demonstration";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag, "In the Create Event");
    }

    public void onStart(){
        super.onStart();
        Log.d(tag, "In the Start Event");
    }

    public void onRestart(){
        super.onRestart();
        Log.d(tag, "In the Restart Event");
    }

    public void onResume(){
        super.onResume();
        Log.d(tag, "In the Resume Event");
    }

    public void onPause(){
        super.onPause();
        Log.d(tag, "In the Pause Event");
    }

    public void onStop(){
        super.onStop();
        Log.d(tag, "In the Stop Event");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d(tag, "In the Destroy Event");
    }
}