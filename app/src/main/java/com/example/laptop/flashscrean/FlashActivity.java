package com.example.laptop.flashscrean;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FlashActivity extends AppCompatActivity {

    private Handler myHandeler;
    private static int splash_time_out = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);


        myHandeler = new Handler();

        myHandeler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent in = new Intent(getApplicationContext(),
                        MainActivity.class);
                startActivity(in);

            }
        },splash_time_out);


    }
}
