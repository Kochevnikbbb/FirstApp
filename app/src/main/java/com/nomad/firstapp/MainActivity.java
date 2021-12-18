package com.nomad.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton btn1 ;
ImageButton btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn1 = findViewById(R.id.imageButton4);
    btn2 = findViewById(R.id.imageButton3);

    btn1.setOnClickListener(view -> {
        Intent i = new Intent(this , MainActivity2.class);
        startActivity(i);
    });
    btn2.setOnClickListener(view -> {
        Intent j = new Intent(this, MainActivity3.class);
        startActivity(j);
    });
    }
}