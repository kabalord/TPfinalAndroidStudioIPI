package com.example.menuactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Activity0 extends AppCompatActivity {

    TextView button1;
    TextView button2;
    TextView button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity0);

        button1 = (TextView) findViewById(R.id.button1);
        button2 = (TextView) findViewById(R.id.button2);
        button3 = (TextView) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iuno = new Intent(Activity0.this, Activity1.class);
                startActivity(iuno);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent idos = new Intent(Activity0.this, Activity2.class);
                startActivity(idos);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itres = new Intent(Activity0.this, Activity3.class);
                startActivity(itres);
            }
        });


    }
}
