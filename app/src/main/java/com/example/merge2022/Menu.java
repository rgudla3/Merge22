package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Menu extends AppCompatActivity {

    private Button recycleItemButton;
    private Button viewPointsButton;
    private Button exitButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        recycleItemButton = findViewById(R.id.checklist_button);
        recycleItemButton.setOnClickListener(l -> {
            startActivity(new Intent(this, Checklist.class));
        });
        viewPointsButton = findViewById(R.id.points_butt);
        viewPointsButton.setOnClickListener(l -> {
            startActivity(new Intent(this, Points.class));
        });
        exitButton = findViewById(R.id.exit);
        exitButton.setOnClickListener(l -> {
            startActivity(new Intent(this, WelcomeScreen.class));
        });
    }

}
