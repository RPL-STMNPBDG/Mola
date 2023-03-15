package com.shakila.mola;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registerdua extends AppCompatActivity {
    EditText etNama, etEmail, etPw;
    Button btAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerdua);

        etNama = (EditText) findViewById(R.id.etNama);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPw = (EditText) findViewById(R.id.etPW);
        btAkun = (Button) findViewById(R.id.btAkun);

        btAkun.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String username = etNama.getText().toString();
                        String email = etEmail.getText().toString();
                        String password = etPw.getText().toString();

                        if(username.equals("Shakila Aulia")&&password.equals("12345")&&email.equals("shakila.aulia245@gmail.com")){
                            Toast.makeText(getApplicationContext(),"LOGIN SUKSES", Toast.LENGTH_SHORT).show();
                            Intent login = new Intent(registerdua.this, home.class);
                            startActivity(login);
                            finish();
                        }
                        else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(registerdua.this);
                            builder.setMessage("EMAIL SALAH") .setNegativeButton("Retry",null).create().show();
                        }
                    }
                }
        );


    }
}