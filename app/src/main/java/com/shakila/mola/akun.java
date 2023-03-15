package com.shakila.mola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class akun extends AppCompatActivity {
    ImageView orang, suka, home, search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        home = (ImageView) findViewById(R.id.home);
        search = (ImageView) findViewById(R.id.search);
        orang = (ImageView) findViewById(R.id.orang);
        suka = (ImageView) findViewById(R.id.suka);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukahome=new Intent(akun.this, home.class);
                startActivity(bukahome);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukasearch=new Intent(akun.this, search.class);
                startActivity(bukasearch);
            }
        });

        orang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaakun=new Intent(akun.this, akun.class);
                startActivity(bukaakun);
            }
        });

        suka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukasuka=new Intent(akun.this, favorit.class);
                startActivity(bukasuka);
            }
        });
    }
}