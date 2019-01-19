package com.example.user.foodfix_12.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.foodfix_12.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView textView;
    private TextView registerScreen;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registerScreen = findViewById(R.id.link_to_register);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.btnLogin);

        // Listening to register new account link
        registerScreen.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                Intent intent = new Intent(LoginActivity.this, MainMenu.class);
                startActivity(intent);
                break;
            case R.id.link_to_register:
                Intent intent2 = new Intent(LoginActivity.this, RegistrActivity.class);
                startActivity(intent2);
                break;
        }

    }

}
