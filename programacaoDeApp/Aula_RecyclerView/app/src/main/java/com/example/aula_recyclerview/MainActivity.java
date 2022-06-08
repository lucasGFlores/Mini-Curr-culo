package com.example.aula_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText ingredientes,nome,preco;
    ImageView foto;
    ArrayList<Prato> cardapio = new ArrayList<Prato>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        ingredientes = findViewById(R.id.ingredientes);
        preco = findViewById(R.id.preco);
        nome = findViewById(R.id.nume);
        foto = findViewById(R.id.fotoPika);
    }
    public void cadastra(View v){
        String np = nome.getText().toString();
        float precoFoda = Float.parseFloat(preco.getText().toString());
        String ingrediente = ingredientes.getText().toString();
        Prato p = new Prato(np,ingrediente,precoFoda);
        cardapio.add(p);
        Toast.makeText(this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
        preco.setText(null);
        nome.setText(null);
        ingredientes.setText(null);
    }
    public void listar(View v){
        Intent i = new Intent(this, TelaCardapio.class);
        TelaCardapio.cardapio = cardapio;
        startActivity(i);

    }
    public interface OnItemClickListener {
        void onItemClick (ImageView prato);
    }
}