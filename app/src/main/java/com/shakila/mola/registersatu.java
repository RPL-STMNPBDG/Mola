package com.shakila.mola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registersatu extends AppCompatActivity {
    private Button btLogin, btAkun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registersatu);

        btAkun = (Button) findViewById(R.id.btAkun);
        btLogin = (Button) findViewById(R.id.btLogin);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukasatu=new Intent(registersatu.this, registertiga.class);
                startActivity(bukasatu);
                finish();
            }
        });

        btAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bukadua();
            }
        });
    }
    public void bukadua(){
        Intent bukadua=new Intent(registersatu.this, registerdua.class);
        startActivity(bukadua);
        finish();
    }

}