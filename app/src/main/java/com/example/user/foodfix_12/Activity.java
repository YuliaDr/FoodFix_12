package com.example.user.foodfix_12;

import android.net.Network;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

public class Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Network.helloApi.getHelloMessage()
                .observeOn(AndroidSchedulers.mainThread())
                .delaySubscription(3, TimeUnit.SECONDS)
                .subscribe(new Consumer<HelloMessage>() {
                    @Override
                    public void accept(HelloMessage helloMessage) throws Exception {
                        ((TextView) findViewById(R.id.text_view)).setText(helloMessage.message);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.e("error", throwable.getMessage(), throwable);
                    }
                });
    }

}
