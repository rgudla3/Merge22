package com.example.merge2022;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private Button submitButton;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        EditText nameEdit = findViewById(R.id.username);
        submitButton = findViewById(R.id.login_button);
        submitButton.setOnClickListener(l -> {
            WelcomeScreen.userName = String.valueOf(nameEdit.getText());
            startActivity(new Intent(this, Menu.class));
        });
    };
}
