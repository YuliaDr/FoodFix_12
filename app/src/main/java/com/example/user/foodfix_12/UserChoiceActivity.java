package com.example.user.foodfix_12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class UserChoiceActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textViewUs;
    TextView textViewRst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        textViewRst = findViewById(R.id.restorator);
        textViewUs = findViewById(R.id.user);

        textViewRst.setOnClickListener(this);
        textViewUs.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.user:
                Intent intent = new Intent(UserChoiceActivity.this, LoginActivity.class);
                startActivity(intent);
            case R.id.restorator:
        }

    }
}