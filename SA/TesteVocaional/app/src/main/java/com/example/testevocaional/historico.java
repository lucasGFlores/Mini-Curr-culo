package com.example.testevocaional;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.badge.BadgeDrawable;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class historico extends AppCompatActivity {
    static MediaPlayer mpkh;
    static ArrayList<Profissao> roberto;
    RecyclerView rv;
    Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        int i =0;
        for(Profissao p : roberto){
            i++;
                 //   print(""+i);
        }
        setContentView(R.layout.activity_historico);

        rv = findViewById(R.id.lista);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        adaptador = new Adaptador(this, roberto, new Adaptador.OnItemClickListener() {
            @Override
            public void onItemClick(Profissao profissao) {

            }
        });
        rv.setAdapter(adaptador);
        adaptador.notifyDataSetChanged();
    }
    public void print(String msg) {
        Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }
    public void voltarParaEscolha(View v){
        mpkh.stop();
        Intent i = new Intent(this, Escolhas.class);
        startActivity(i);

    }
}