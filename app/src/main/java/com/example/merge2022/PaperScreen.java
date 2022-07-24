package com.example.merge2022;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PaperScreen extends AppCompatActivity {

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
        setContentView(R.layout.paper);
        yes1 = findViewById(R.id.yesButton1);
        no1 = findViewById(R.id.noButton1);
        continueNext = findViewById(R.id.continueArrow);
        continueNext.setOnClickListener(l -> {
            startActivity(new Intent(this, CanRecycle.class));
        });

        yes1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yesUnselected1 = findViewById(R.id.yesSelected1);
                yesUnselected1.setVisibility(View.VISIBLE);

                AlertDialog.Builder builder = new AlertDialog.Builder(PaperScreen.this);

                builder.setCancelable(true);
                builder.setTitle("Your paper is soiled or wet.");
                builder.setMessage("Please dispose of paper in trash.");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(PaperScreen.this, CannotRecycle.class);
                        startActivity(intent);
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

                AlertDialog.Builder builder = new AlertDialog.Builder(PaperScreen.this);

                builder.setCancelable(true);
                builder.setTitle("Your paper is not soiled or wet.");
                builder.setMessage("You may proceed!");

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) { }
                });
                builder.show();
            }
        });

    }

}
