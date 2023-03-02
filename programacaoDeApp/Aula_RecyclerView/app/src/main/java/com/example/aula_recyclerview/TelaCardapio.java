package com.example.aula_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class TelaCardapio extends AppCompatActivity {
    static ArrayList<Prato> cardapio;
    RecyclerView rv;
    Adaptador adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cardapio);
        getSupportActionBar().hide();
        rv = findViewById(R.id.lista);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adaptador(this, cardapio, new Adaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Prato prato) {
print(prato.nome+"");            }
        });
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    public void print(String msg){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}