package com.example.user.flashlight;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;

import java.util.logging.LogRecord;

public class MainActivity extends Activity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iMenu = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(iMenu);
                finish();
            }
        },5000);


    }
}
