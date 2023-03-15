package com.shakila.mola;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class splashscreen extends AppCompatActivity {
    private int waktu_loading=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent registersatu=new Intent(splashscreen.this, registersatu.class);
                startActivity(registersatu);
                finish();
            }
        },waktu_loading);


    }
}