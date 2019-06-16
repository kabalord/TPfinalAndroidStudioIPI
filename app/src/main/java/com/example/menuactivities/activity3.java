package com.example.menuactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity3 extends AppCompatActivity implements View.OnClickListener {

    EditText numero1, numero2;
    Button somme, soustraire, multiplication, division;
    TextView result;

    TextView btnreturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3);


        numero1 = (EditText) findViewById(R.id.numero1);
        numero2 = (EditText) findViewById(R.id.numero2);

        somme = (Button) findViewById(R.id.somme);
        soustraire = (Button) findViewById(R.id.soustraire);
        multiplication = (Button) findViewById(R.id.multiplication);
        division = (Button) findViewById(R.id.division);

        result = (TextView) findViewById(R.id.result);


        somme.setOnClickListener(this);
        soustraire.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);


        btnreturn = (TextView) findViewById(R.id.btnreturn);

        btnreturn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Intent btnreturn = new Intent(activity3.this, MainActivity.class);
                startActivity(btnreturn);
            }
        });
    }

    @Override
    public void onClick(View v) {

        String chiffre1 = numero1.getText().toString();

        String chiffre2 = numero2.getText().toString();


        int entier1 = Integer.parseInt(chiffre1);
        int entier2 = Integer.parseInt(chiffre2);

        int finalResult = 0;

        switch (v.getId()) {
            case R.id.somme:
                finalResult = entier1+entier2;
                break;
            case R.id.soustraire:
                finalResult = entier1-entier2;
                break;
            case R.id.multiplication:
                finalResult = entier1*entier2;
                break;
            case R.id.division:
                finalResult = entier1/entier2;
                break;
        }

        result.setText(""+finalResult);

    }

}
