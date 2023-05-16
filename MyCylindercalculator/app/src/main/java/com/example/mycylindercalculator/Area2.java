package com.example.mycylindercalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Area2 extends AppCompatActivity {
    Button btn_voltar, btn_calcular;
    EditText edt_raio,edt_alt;
    TextView edt_res;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area2);

        btn_voltar = findViewById(R.id.btn_voll);
        btn_calcular = findViewById(R.id.btn_calcular);
        edt_raio = findViewById(R.id.edt_raio);
        edt_alt = findViewById(R.id.edt_alt);
        edt_res = findViewById(R.id.edt_res);

        edt_raio.requestFocus();

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences preferences = getSharedPreferences("chaveGeral", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("chaveRaio", edt_raio.getText().toString());
                editor.putString("chaveAltura", edt_raio.getText().toString());
                editor.commit();
                Toast.makeText(Area2.this,"Seus daddos foram roubados!!!", Toast.LENGTH_LONG).show();
            }
        });




        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish();}
        });
    }
}