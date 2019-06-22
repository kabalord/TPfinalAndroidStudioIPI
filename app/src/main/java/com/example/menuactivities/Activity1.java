package com.example.menuactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Activity1 extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    TextView btnreturn;
    SeekBar  red, green, blue;
    TextView  vred, vgreen, vblue, color;
    int r = 0, g = 0, b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);

        red = (SeekBar) findViewById(R.id.red);
        green = (SeekBar) findViewById(R.id.green);
        blue = (SeekBar) findViewById(R.id.blue);
        color = (TextView) findViewById(R.id.color);
        vred = (TextView) findViewById(R.id.vred);
        vgreen = (TextView) findViewById(R.id.vgreen);
        vblue = (TextView) findViewById(R.id.vblue);

        red.setOnSeekBarChangeListener(this);
        green.setOnSeekBarChangeListener(this);
        blue.setOnSeekBarChangeListener(this);

        btnreturn = (TextView) findViewById(R.id.btnreturn);

        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnreturn = new Intent(Activity1.this, Activity0.class);
                startActivity(btnreturn);
            }
        });


    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Toast.makeText(red.getContext(), "cambiando color!", Toast.LENGTH_SHORT).show();
        switch (seekBar.getId() ){
            case R.id.red:
                r=progress;
                break;
            case R.id.green:
                g=progress;
                break;
            case R.id.blue:
                b=progress;
                break;

        }

        vred.setText("R: "+r);
        vgreen.setText("G: "+g);
        vblue.setText("B: "+b);


        color.setBackgroundColor(android.graphics.Color.rgb(r, g, b));
    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {


    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
