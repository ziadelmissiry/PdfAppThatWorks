package com.example.pdfapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        floatingActionButton = findViewById(R.id.floatingbtn);


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(), uploadPDF.class);
                        startActivity(intent);
            }
        });
    }
}