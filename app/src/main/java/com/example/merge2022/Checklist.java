package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Checklist extends AppCompatActivity {

    private TextView tester;
    private Button plasticBottle;
    private Button fbCan;
    private Button fbCarton;
    private Button paper;
    private Button cardboard;
    private Button plasticBag;
    private Button plasticWrap;
    private Button flexPack;
    private Button tangler;
    private Button diaper;
    private Button plasticWax;
    private Button polyFoam;
    private Button food;
    private Button med;
    private Button metal;
    private Button electronics;
    private Button batteries;
    private Button clothing;
    private ArrayList<Button> buttons;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist_init);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        tester = findViewById(R.id.hello_usern);
        tester.setText("Hello, " + name + "!");
        // link all buttons

        plasticBottle = findViewById(R.id.plasticBottle);
        fbCan = findViewById(R.id.fbCan);
        fbCarton = findViewById(R.id.fbCarton);
        paper = findViewById(R.id.paper);
        cardboard = findViewById(R.id.CBorPB);
        plasticBag = findViewById(R.id.plasticBag);
        plasticWrap = findViewById(R.id.plasticFilmWrap);
        flexPack = findViewById(R.id.flexPack);
        tangler = findViewById(R.id.tangler);
        diaper = findViewById(R.id.diaper);
        plasticWax = findViewById(R.id.plasticWax);
        polyFoam = findViewById(R.id.polyFoam);
        food = findViewById(R.id.food);
        med = findViewById(R.id.medicalItem);
        metal = findViewById(R.id.metalWaste);
        electronics = findViewById(R.id.electronics);
        batteries = findViewById(R.id.batteries);
        clothing = findViewById(R.id.clothing);

        directToCannotRecycle(fbCarton);
        directToCannotRecycle(plasticBag);
        directToCannotRecycle(plasticWrap);
        directToCannotRecycle(flexPack);
        directToCannotRecycle(tangler);
        directToCannotRecycle(diaper);
        directToCannotRecycle(plasticWax);
        directToCannotRecycle(food);
        directToCannotRecycle(med);
        directToCannotRecycle(metal);
        directToCannotRecycle(electronics);
        directToCannotRecycle(batteries);
        directToCannotRecycle(clothing);
        directToCannotRecycle(polyFoam);


        plasticBottle.setOnClickListener(l -> {
            startActivity(new Intent(this, PlasticBottleScreen.class));
        });

        paper.setOnClickListener(l -> {
            startActivity(new Intent(this, PaperScreen.class));
        });

        fbCan.setOnClickListener(l -> {
            startActivity(new Intent(this, FoodBeverageCanScreen.class));
        });

        cardboard.setOnClickListener(l -> {
            startActivity(new Intent(this, CardboardScreen.class));
        });

    }

    public void directToCannotRecycle(Button button) {
        button.setOnClickListener(l -> {
            startActivity(new Intent(this, CannotRecycle.class));
        });
    }
}
