package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class PointIncrement extends AppCompatActivity {

    private Button viewPointsButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.point_increment);
        viewPointsButton = findViewById(R.id.view_points_button);
        viewPointsButton.setOnClickListener(l -> {
            startActivity(new Intent(this, Points.class));
        });
    }

}
