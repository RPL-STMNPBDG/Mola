package com.shakila.mola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class pembelian extends AppCompatActivity {
    TextView outNama, outAlamat, outNoHP, outMerk, outWarna, outHarga,
    outMerkCard, outWarnaCard, outHargaCard;
    ImageView outGambar, arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembelian);

        outNama = (TextView) findViewById(R.id.outNama);
        outAlamat = (TextView) findViewById(R.id.outAlamat);
        outNoHP = (TextView) findViewById(R.id.outNoHP);
        outMerk = (TextView) findViewById(R.id.outMerk);
        outWarna = (TextView) findViewById(R.id.outWarna);
        outHarga = (TextView) findViewById(R.id.outHarga);
        outMerkCard = (TextView) findViewById(R.id.outMerkCard);
        outWarnaCard = (TextView) findViewById(R.id.outWarnaCard);
        outHargaCard = (TextView) findViewById(R.id.outHargaCard);
        outGambar = (ImageView) findViewById(R.id.outGambar);
        arrow = (ImageView) findViewById(R.id.arrow);

        outNama.setText(getIntent().getStringExtra("nama"));
        outAlamat.setText(getIntent().getStringExtra("alamat"));
        outNoHP.setText(getIntent().getStringExtra("nohp"));
        outMerk.setText(getIntent().getStringExtra("merk"));
        outWarna.setText(getIntent().getStringExtra("warna"));
        outHarga.setText(getIntent().getStringExtra("harga"));
        outMerkCard.setText(getIntent().getStringExtra("merk"));
        outWarnaCard.setText(getIntent().getStringExtra("warna"));
        outHargaCard.setText(getIntent().getStringExtra("harga"));

        String merk = outMerk.getText().toString();

        if (merk.equals("Aston Martin DB11")){
            outGambar.setImageResource(R.drawable.mobil8);
        }
        else if (merk.equals("BMW X4 SPORTS")){
            outGambar.setImageResource(R.drawable.mobil7);
        }
        else if (merk.equals("ACURA TLX")){
            outGambar.setImageResource(R.drawable.mobil9);
        }

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamenu=new Intent(pembelian.this, home.class);
                startActivity(bukamenu);
                finish();
            }
        });
    }
}