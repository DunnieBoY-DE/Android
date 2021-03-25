package com.example.smartcarpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button Register = (Button)findViewById(R.id.regbut);
        Register.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intentRegister = new Intent(Registration.this, MainActivity.class);
                startActivity(intentRegister);
            }
        });
    }
}