package com.example.user.foodfix_12.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.user.foodfix_12.R;

public class ThankYouActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        TextView registerScreen = findViewById(R.id.link_to_register);
        registerScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), RegistrActivity.class);
                startActivity(i);
            }
        });
        textView = findViewById(R.id.textView);
    }

    private TextView textView;
}

