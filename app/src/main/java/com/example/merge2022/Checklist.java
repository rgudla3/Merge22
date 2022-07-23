package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Checklist extends AppCompatActivity {

    private TextView tester;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checklist_init);
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        tester = findViewById(R.id.hello_usern);
        tester.setText("Hello, " + name + "!");
    }
}
