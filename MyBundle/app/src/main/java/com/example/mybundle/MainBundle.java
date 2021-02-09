package com.example.mybundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainBundle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bundle);
        TextView textView = findViewById(R.id.txt2);

        Bundle bundle = getIntent().getExtras();
        String data = bundle.getString("data");
        textView.setText(data);
    }
}