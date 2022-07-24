package com.example.merge2022;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class FoodBeverageCanScreen extends AppCompatActivity {

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
        setContentView(R.layout.food_beverage_can);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(FoodBeverageCanScreen.this);

                builder.setCancelable(true);
                builder.setTitle("Your can is made of tin, aluminum, or steel!");
                builder.setMessage("You may proceed. In the future, be sure recycle cans that are only made of tin, aluminum, or steel.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) { }
                });
                builder.show();
            }
        });
        yes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yesUnselected2 = findViewById(R.id.yesSelected2);
                yesUnselected2.setVisibility(View.VISIBLE);

                AlertDialog.Builder builder = new AlertDialog.Builder(FoodBeverageCanScreen.this);

                builder.setCancelable(true);
                builder.setTitle("You have a plastic lid!");
                builder.setMessage("Please remove the plastic lid before recycling.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                builder.show();
            }
        });
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noUnselected1 = findViewById(R.id.noSelected1);
                noUnselected1.setVisibility(View.VISIBLE);

                AlertDialog.Builder builder = new AlertDialog.Builder(FoodBeverageCanScreen.this);

                builder.setCancelable(true);
                builder.setTitle("Your can is not made of tin, aluminum, or steel");
                builder.setMessage("Please select another item to recycle. In the future, be sure recycle cans that are only made of tin, aluminum, or steel.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(FoodBeverageCanScreen.this, CannotRecycle.class);
                        startActivity(intent);
                    }
                });
                builder.show();
            }
        });
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noUnselected2 = findViewById(R.id.noSelected2);
                noUnselected2.setVisibility(View.VISIBLE);

                AlertDialog.Builder builder = new AlertDialog.Builder(FoodBeverageCanScreen.this);

                builder.setCancelable(true);
                builder.setTitle("You don't have your can's plastic lid, if applicable!");
                builder.setMessage("You may proceed. In the future, be sure to discard your plastic lid before recycling.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) { }
                });
                builder.show();
            }
        });
    }

}
