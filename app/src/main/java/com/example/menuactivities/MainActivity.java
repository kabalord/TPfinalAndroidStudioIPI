package com.example.menuactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // generate log error
        Log.e("Log error", new Date().toString());

        // generate log warning
        Log.w("Log warning", new Date().toString());

        // generate what the fuck error
        Log.wtf("WTF error", new Date().toString());



    }
}