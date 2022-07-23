package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Checklist extends AppCompatActivity {

    private Button recycleButton;

    private TextView tester;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dummy);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        tester = findViewById(R.id.tester);
        tester.setText("Hello, " + name + "! Here is a list of recommended drinks. Please select one or enter a drink of your choice.");
    }
}
