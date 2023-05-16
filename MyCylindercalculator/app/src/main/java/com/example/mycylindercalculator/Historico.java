package com.example.mycylindercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.badge.BadgeUtils;

public class Historico extends AppCompatActivity {

    Button btn_voll;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);

        result = findViewById(R.id.result);

        String raio, altura;
        SharedPreferences preferences = getSharedPreferences("chaveGeral", MODE_PRIVATE);
        raio = preferences.getString("chavaRaio","");
        altura = preferences.getString("chavealtura","");
        result.setText("hello teste" + raio + altura);

        btn_voll = findViewById(R.id.btn_voll);

        btn_voll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}