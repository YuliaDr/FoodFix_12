package com.example.user.foodfix_12;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView registerScreen = findViewById(R.id.link_to_register);

        textView = findViewById(R.id.textView);

        // Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
            // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), RegistrActivity.class);
                startActivity(i);
            }
        });
    }


}
