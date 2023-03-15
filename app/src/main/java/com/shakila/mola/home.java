package com.shakila.mola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {
    ImageView orang, suka, home, search;
    CardView mobil1, mobil2, mobil3;
    ImageSlider ImageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        home = (ImageView) findViewById(R.id.home);
        search = (ImageView) findViewById(R.id.search);
        orang = (ImageView) findViewById(R.id.orang);
        suka = (ImageView) findViewById(R.id.suka);
        mobil1 = (CardView) findViewById(R.id.mobil1);
        mobil2 = (CardView) findViewById(R.id.mobil2);
        mobil3 = (CardView) findViewById(R.id.mobil3);
        ImageSlider = (ImageSlider) findViewById(R.id.slider);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.mobilslide));
        slideModels.add(new SlideModel(R.drawable.lamboslide));
        slideModels.add(new SlideModel(R.drawable.sportslide));

        ImageSlider.setImageList(slideModels,true);


        mobil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(home.this, MainActivity.class);
                startActivity(bukamobil);
            }
        });

        mobil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(home.this, mobildua.class);
                startActivity(bukamobil);
            }
        });

        mobil3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamobil=new Intent(home.this, mobiltiga.class);
                startActivity(bukamobil);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukahome=new Intent(home.this, home.class);
                startActivity(bukahome);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukasearch=new Intent(home.this, search.class);
                startActivity(bukasearch);
            }
        });

        orang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaakun=new Intent(home.this, akun.class);
                startActivity(bukaakun);
            }
        });

        suka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukasuka=new Intent(home.this, favorit.class);
                startActivity(bukasuka);
            }
        });
    }
}