package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class PointIncrement extends AppCompatActivity {

    private Button viewPointsButton;
    public static final String EXTRA_MESSAGE = "com.example.merge22.MESSAGE";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_increment);
        viewPointsButton = findViewById(R.id.view_points_button);
        viewPointsButton.setOnClickListener(l -> {
            Login.score += 1;
            String scoreString = "" + Login.score;
            Intent intent = new Intent(PointIncrement.this, Points.class);
            intent.putExtra(EXTRA_MESSAGE, scoreString);
            startActivity(intent);
        });
    }

}
