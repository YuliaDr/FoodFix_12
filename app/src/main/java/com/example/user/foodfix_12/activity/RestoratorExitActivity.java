package com.example.user.foodfix_12.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.user.foodfix_12.R;

public class RestoratorExitActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restoratorexit);

        textView = findViewById(R.id.textView);
    }
}
