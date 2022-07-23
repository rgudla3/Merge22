package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CanRecycle extends AppCompatActivity {

    private Button mapButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.can_recycle);
        mapButton = findViewById(R.id.maps_button);
        mapButton.setOnClickListener(l -> {
            startActivity(new Intent(this, MapsActivity.class));
        });
    }

}
