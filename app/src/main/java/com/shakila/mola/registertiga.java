package com.shakila.mola;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registertiga extends AppCompatActivity {
    EditText etEmail, etPw;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registertiga);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPw = (EditText) findViewById(R.id.etPW);
        btLogin = (Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String email = etEmail.getText().toString();
                        String password = etPw.getText().toString();

                        if(email.equals("shakila.aulia245@gmail.com")&&password.equals("12345")){
                            Toast.makeText(getApplicationContext(),"LOGIN SUKSES", Toast.LENGTH_SHORT).show();
                            Intent login = new Intent(registertiga.this, home.class);
                            startActivity(login);
                            finish();
                        }
                        else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(registertiga.this);
                            builder.setMessage("EMAIL ATAU PASSWORD SALAH") .setNegativeButton("Retry",null).create().show();
                        }
                    }
                }
        );


    }
}