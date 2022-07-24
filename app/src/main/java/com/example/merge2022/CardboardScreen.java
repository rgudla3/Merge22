package com.example.merge2022;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CardboardScreen extends AppCompatActivity {

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
        setContentView(R.layout.cardboard);
        yes1 = findViewById(R.id.foodWasteYesButton);
        no1 = findViewById(R.id.frostedNoButton);
        yes2 = findViewById(R.id.yesButton);
        no2 = findViewById(R.id.decorativeNoButton);
        continueNext = findViewById(R.id.continueArrow);
        continueNext.setOnClickListener(l -> {
            startActivity(new Intent(this, CanRecycle.class));
        });
        yes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yesUnselected1 = findViewById(R.id.frostedYesSelected);
                yesUnselected1.setVisibility(View.VISIBLE);
                AlertDialog.Builder builder = new AlertDialog.Builder(CardboardScreen.this);

                builder.setCancelable(true);
                builder.setTitle("Your cardboard is flat?");
                builder.setMessage("You may proceed!");

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
                yesUnselected2 = findViewById(R.id.decorativeYesSelected);
                yesUnselected2.setVisibility(View.VISIBLE);

                AlertDialog.Builder builder = new AlertDialog.Builder(CardboardScreen.this);

                builder.setCancelable(true);
                builder.setTitle("It is empty.");
                builder.setMessage("Please proceed!");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) { }
                });
                builder.show();
            }
        });
        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noUnselected1 = findViewById(R.id.frostedNoSelected);
                noUnselected1.setVisibility(View.VISIBLE);

                AlertDialog.Builder builder = new AlertDialog.Builder(CardboardScreen.this);

                builder.setCancelable(true);
                builder.setTitle("Your cardboard is not flat.");
                builder.setMessage("You may proceed. Please flatten it before recycling.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) { }
                });
                builder.show();
            }
        });
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noUnselected2 = findViewById(R.id.decorativeNoSelected);
                noUnselected2.setVisibility(View.VISIBLE);

                AlertDialog.Builder builder = new AlertDialog.Builder(CardboardScreen.this);

                builder.setCancelable(true);
                builder.setTitle("Your cardboard is not an empty box");
                builder.setMessage("You may proceed. Please empty and make sure it’s not too greasy before recycling.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) { }
                });
                builder.show();
            }
        });
    }

}
