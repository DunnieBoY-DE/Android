package com.example.smartcarpark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = (Button)findViewById(R.id.bookbtn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentButton = new Intent(MainActivity.this, Homepage.class);
                startActivity(intentButton);
            }
        });
        Button signIn = (Button)findViewById(R.id.signin);
        signIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intentSignIn = new Intent(MainActivity.this, Registration.class);
                startActivity(intentSignIn);
            }
        });
    }


}