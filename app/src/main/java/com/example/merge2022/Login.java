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
            String name = String.valueOf(nameEdit.getText());
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            Intent i = new Intent(this, Checklist.class);
            i.putExtras(bundle);
            startActivity(i);
            finish();
        });
    };
}
