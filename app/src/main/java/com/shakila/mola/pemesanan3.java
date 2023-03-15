package com.shakila.mola;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class pemesanan3 extends AppCompatActivity {
    TextView inputMerk,harga;
    EditText inputNama, inputAlamat, inputNoHP;
    RadioGroup inputWarna;
    RadioButton warna;
    Button beli;
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan3);

        inputWarna = (RadioGroup) findViewById(R.id.inputWarna);
        inputNama = (EditText) findViewById(R.id.inputNama);
        inputAlamat = (EditText) findViewById(R.id.inputAlamat);
        inputNoHP = (EditText) findViewById(R.id.inputNoHP);
        inputMerk = (TextView) findViewById(R.id.inputMerk);
        harga = (TextView) findViewById(R.id.harga);
        beli = (Button) findViewById(R.id.beli);
        arrow = (ImageView) findViewById(R.id.arrow);

        beli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                int radioId = inputWarna.getCheckedRadioButtonId();

                warna = (RadioButton) findViewById(radioId);



                if (inputNama.getText().toString().length()==0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(pemesanan3.this);
                    builder.setMessage("Data Tidak Lengkap")
                            .setNegativeButton("Coba Lagi", null).create().show();
                }
                else if (inputAlamat.getText().toString().length()==0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(pemesanan3.this);
                    builder.setMessage("Data Tidak Lengkap")
                            .setNegativeButton("Coba Lagi", null).create().show();
                }
                else if (inputNoHP.getText().toString().length()==0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(pemesanan3.this);
                    builder.setMessage("Data Tidak Lengkap")
                            .setNegativeButton("Coba Lagi", null).create().show();
                }
                else if (warna.getText().toString().matches("")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(pemesanan3.this);
                    builder.setMessage("Data Tidak Lengkap")
                            .setNegativeButton("Coba Lagi", null).create().show();
                }
                else{
                    Intent i = new Intent(pemesanan3.this, pembelian.class);
                    i.putExtra("nama", inputNama.getText().toString());
                    i.putExtra("alamat", inputAlamat.getText().toString());
                    i.putExtra("nohp", inputNoHP.getText().toString());
                    i.putExtra("warna", warna.getText().toString());
                    i.putExtra("merk", inputMerk.getText().toString());
                    i.putExtra("harga", harga.getText().toString());
                    startActivity(i);
                    Toast.makeText(getApplicationContext(), "Pembelian Berhasil", Toast.LENGTH_SHORT).show();
                }
            }
        });
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukamenu=new Intent(pemesanan3.this, mobiltiga.class);
                startActivity(bukamenu);
                finish();
            }
        });
    }
}