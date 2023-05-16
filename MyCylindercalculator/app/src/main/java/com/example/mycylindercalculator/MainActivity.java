package com.example.mycylindercalculator;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_sair, btn_vol, btn_his;
    Button btn_teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sair = findViewById(R.id.btn_voll);
        btn_vol = findViewById(R.id.btn_vol);
        btn_his = findViewById(R.id.btn_calcular);
        btn_teste = findViewById(R.id.button2);


        btn_teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Area2.class);
                startActivity(intent);
            }
        });

        btn_his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Historico.class);
                startActivity(intent);
            }
        });

        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, volume.class);
                startActivity(intent);
            }
        });
    }

}