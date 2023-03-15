package com.shakila.mola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    ImageView menu;
    Button tombol;
    LinearLayout mobil1,mobil2,mobil3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu = (ImageView) findViewById(R.id.menu);
        tombol = (Button) findViewById(R.id.tombol);
        mobil1 =(LinearLayout) findViewById(R.id.mobil1);
        mobil2 =(LinearLayout) findViewById(R.id.mobil2);
        mobil3 =(LinearLayout) findViewById(R.id.mobil3);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamenu=new Intent(MainActivity.this, home.class);
                startActivity(bukamenu);
            }
        });
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaco=new Intent(MainActivity.this, pemesanan.class);
                startActivity(bukaco);
            }
        });
        mobil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(MainActivity.this, MainActivity.class);
                startActivity(bukamobil);
            }
        });
        mobil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(MainActivity.this, mobiltiga.class);
                startActivity(bukamobil);
            }
        });
        mobil3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(MainActivity.this, mobildua.class);
                startActivity(bukamobil);
            }
        });
    }
}