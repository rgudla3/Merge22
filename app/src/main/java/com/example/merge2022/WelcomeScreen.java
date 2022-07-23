package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class WelcomeScreen extends AppCompatActivity {

    private Button recycleButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);
        recycleButton = findViewById(R.id.recycle_but);
        recycleButton.setOnClickListener(l -> {
            startActivity(new Intent(this, Login.class));
        });
    }

}
