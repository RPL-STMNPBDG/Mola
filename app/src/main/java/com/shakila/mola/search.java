package com.shakila.mola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class search extends AppCompatActivity {
    ImageView orang, suka, home, search;
    CardView mobil1, mobil2, mobil3, mobil4, mobil5, mobil6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        home = (ImageView) findViewById(R.id.home);
        search = (ImageView) findViewById(R.id.search);
        orang = (ImageView) findViewById(R.id.orang);
        suka = (ImageView) findViewById(R.id.suka);
        mobil1 = (CardView) findViewById(R.id.mobil1);
        mobil2 = (CardView) findViewById(R.id.mobil2);
        mobil3 = (CardView) findViewById(R.id.mobil3);
        mobil4 = (CardView) findViewById(R.id.mobil4);
        mobil5 = (CardView) findViewById(R.id.mobil5);
        mobil6 = (CardView) findViewById(R.id.mobil6);

        mobil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(search.this, mobildua.class);
                startActivity(bukamobil);
            }
        });

        mobil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(search.this, MainActivity.class);
                startActivity(bukamobil);
            }
        });

        mobil3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(search.this, mobiltiga.class);
                startActivity(bukamobil);
            }
        });

        mobil4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(search.this, MainActivity.class);
                startActivity(bukamobil);
            }
        });

        mobil5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(search.this, mobildua.class);
                startActivity(bukamobil);
            }
        });

        mobil6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(search.this, mobiltiga.class);
                startActivity(bukamobil);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukahome=new Intent(search.this, home.class);
                startActivity(bukahome);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukasearch=new Intent(search.this, search.class);
                startActivity(bukasearch);
            }
        });

        orang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaakun=new Intent(search.this, akun.class);
                startActivity(bukaakun);
            }
        });

        suka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukasuka=new Intent(search.this, favorit.class);
                startActivity(bukasuka);
            }
        });
    }
}