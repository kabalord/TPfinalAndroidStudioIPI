package com.example.menuactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void seConnecter(View v){
        EditText loginStr = (EditText)findViewById(R.id.login);
        EditText  passdStr = (EditText)findViewById(R.id.passwd);

        if (loginStr.getText().toString().equals("walter") && passdStr.getText().toString().equals("roa")){
            Intent i = new Intent(this, Activity0.class);
            startActivity(i);
        }else {
            Toast.makeText(this, getString(R.string.connectFailed), Toast.LENGTH_LONG).show();
        }

    }
}
