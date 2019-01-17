package com.example.user.foodfix_12.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.user.foodfix_12.R;
import com.example.user.foodfix_12.UserChoiceActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    Handler handler;
    int limit = 3;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        textView = findViewById(R.id.textView);

        handler = new Handler();
        onEverySecond.run();
    }

    Runnable onEverySecond = new Runnable() {
        public void run() {

            count++;
            if (count == limit) {
                Intent intent = new Intent(MainActivity.this, UserChoiceActivity.class);
                startActivity(intent);
                finish();
            } else {
                handler.postDelayed(onEverySecond, 1000);
            }
        }
    };
}