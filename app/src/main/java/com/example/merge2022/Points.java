package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Points extends AppCompatActivity {

    private Button home;
    private TextView pointDisplay;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.points);
        pointDisplay = findViewById(R.id.pointDisplay);
        home = findViewById(R.id.home_button);

        Intent intent = getIntent();
        String message = intent.getStringExtra(PointIncrement.EXTRA_MESSAGE);
        pointDisplay.setText(message);
        home.setOnClickListener(l -> {
            startActivity(new Intent(this, WelcomeScreen.class));
        });
    }

}