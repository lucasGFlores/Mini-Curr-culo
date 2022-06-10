package com.example.testevocaional;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado extends AppCompatActivity {

    static Profissao i;
    ImageView image;

    TextView nome, descricao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        nome = findViewById(R.id.nomesin);
        descricao = findViewById(R.id.descricao);
        image = findViewById(R.id.imagem);
        nome.setText(i.getNome());
        image.setImageResource(i.getFoto());
        descricao.setText(i.getDescricao());
        //TheSabidom();
        Toast.makeText(this, "AAAA$#qäyt$WTBrywQGTGWGTEAXGHDGRHDUUTR", Toast.LENGTH_LONG).show();

    }



    public void print(String msg) {
        Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }



    public void voltarEscolha(View v) {
        Intent i = new Intent(this, Escolhas.class);
        //i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void refazer(View v) {
        Intent i = new Intent(this, lp1.class);
        startActivity(i);
    }


}