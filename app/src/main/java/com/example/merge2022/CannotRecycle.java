package com.example.merge2022;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class CannotRecycle extends AppCompatActivity {

    private Button returnButton;
    private Button learnWhy;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cannot_recycle);
        returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(l -> {
            startActivity(new Intent(this, Checklist.class));
        });

        learnWhy = findViewById(R.id.learnWhy);
        learnWhy.setOnClickListener(l -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.epa.gov/recycle/how-do-i-recycle-common-recyclables"));
            startActivity(intent);
        });
    }

}
