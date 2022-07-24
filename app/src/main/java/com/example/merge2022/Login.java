package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    public static String userName = "";
    private Button submitButton;
    public static int score = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        EditText nameEdit = findViewById(R.id.username);
        submitButton = findViewById(R.id.login_button);
        submitButton.setOnClickListener(l -> {
            userName = String.valueOf(nameEdit.getText());
            Intent i = new Intent(this, Checklist.class);
            startActivity(i);
            finish();
        });
    };
}
