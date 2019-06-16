package com.example.menuactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class activity2 extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    TextView btnreturn;
    SeekBar  hue, saturation, lightness;
    TextView  vhue, vsaturation, vlightness, color;
    int h = 0, s = 0, l = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        hue = (SeekBar) findViewById(R.id.hue);
        saturation = (SeekBar) findViewById(R.id.saturation);
        lightness = (SeekBar) findViewById(R.id.lightness);
        color = (TextView) findViewById(R.id.color);
        vhue = (TextView) findViewById(R.id.vhue);
        vsaturation = (TextView) findViewById(R.id.vsaturation);
        vlightness = (TextView) findViewById(R.id.vlightness);

        hue.setOnSeekBarChangeListener(this);
        saturation.setOnSeekBarChangeListener(this);
        lightness.setOnSeekBarChangeListener(this);






        btnreturn = (TextView) findViewById(R.id.btnreturn);

        btnreturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent btnreturn = new Intent(activity2.this, MainActivity.class);
                startActivity(btnreturn);
            }
        });
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        Toast.makeText(hue.getContext(), "cambiando color!", Toast.LENGTH_SHORT).show();
        switch (seekBar.getId() ){
            case R.id.hue:
                h=progress;
                break;
            case R.id.saturation:
                s=progress;
                break;
            case R.id.lightness:
                l=progress;
                break;

        }

        vhue.setText("H: "+h);
        vsaturation.setText("S: "+s);
        vlightness.setText("L: "+l);

        float hsl[] = {h, s, l};
        color.setBackgroundColor(android.graphics.Color.HSVToColor(hsl));



    }


    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {


    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
