package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Points extends AppCompatActivity {

    private Button home;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.points);
        home = findViewById(R.id.home_button);
        home.setOnClickListener(l -> {
            startActivity(new Intent(this,Menu.class));
        });
    }

}