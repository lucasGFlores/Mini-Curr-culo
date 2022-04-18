package com.example.calculadoramaneira;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText lado, altura,numdl, base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lado = findViewById(R.id.campo_lado);
        altura = findViewById(R.id.campo_altura);
        numdl = findViewById(R.id.campo_ndl);
        base = findViewById(R.id.campo_adb);
    }
    public void calcular(View v){
    int l = Integer.parseInt(lado.getText().toString());
    int h =Integer.parseInt(altura.getText().toString());
    int n = Integer.parseInt(numdl.getText().toString());
    int ab = Integer.parseInt(base.getText().toString());
    int o = (l*h*n+ab*2);
    Toast.makeText(this,"esse é a área total " + o, Toast.LENGTH_LONG).show();
    }
}