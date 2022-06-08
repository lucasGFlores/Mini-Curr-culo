package com.example.testevocaional;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Resultado extends AppCompatActivity {

    static Profissao i;
    static float engenheiro;
    static float eletricista;
    static float advogado;
    static float bicheiro;
    static float criador_de_galo_de_briga;
    static float pedreiro;
    static float veterinario;
    static float enfermeiro;
    static float traficante;
    static float programador;
    static float policial;
    static float mecanico;
    static float medico;
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

    }



    public void print(String msg) {
        Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }



    public void voltarEscolha(View v) {
        Intent i = new Intent(this, Escolhas.class);
        startActivity(i);
    }

    public void refazer(View v) {
        Intent i = new Intent(this, lp1.class);
        startActivity(i);
    }


}