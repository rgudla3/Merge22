package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PlasticBottleScreen extends AppCompatActivity {

    private Button yes1;
    private Button no1;
    private Button yes2;
    private Button no2;
    private Button continueNext;
    private View yesUnselected1;
    private View noUnselected1;
    private View yesUnselected2;
    private View noUnselected2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plastic_bottle);
        yes1 = findViewById(R.id.yesButton1);
        no1 = findViewById(R.id.noButton1);
        yes2 = findViewById(R.id.yesButton);
        no2 = findViewById(R.id.noButton2);
        continueNext = findViewById(R.id.continueArrow);
        continueNext.setOnClickListener(l -> {
            startActivity(new Intent(this, CanRecycle.class));
        });
        yes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yesUnselected1 = findViewById(R.id.yesSelected1);
                yesUnselected1.setVisibility(View.VISIBLE);
            }
        });
        yes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yesUnselected2 = findViewById(R.id.yesSelected2);
                yesUnselected2.setVisibility(View.VISIBLE);
            }
        });
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noUnselected1 = findViewById(R.id.noSelected1);
                noUnselected1.setVisibility(View.VISIBLE);
            }
        });
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noUnselected2 = findViewById(R.id.noSelected2);
                noUnselected2.setVisibility(View.VISIBLE);
            }
        });
    }

}
