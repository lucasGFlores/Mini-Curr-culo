package com.example.testevocaional;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Escolhas extends AppCompatActivity {
    MediaPlayer mp;
    ArrayList<Profissao> toper = new ArrayList<>();
    static String login,senha;
    static int ido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolhas);
        getSupportActionBar().hide();
        mp = MediaPlayer.create(this, R.raw.pizzaria_club_penguim);
        mp.start();
        Resultado.mp = mp;
    }
    public void xampson(View v){
       mp.stop();
        Intent i = new Intent(this, Thetrueescolha.class);
        startActivity(i);
    }
    public void print(String msg) {
        Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }
    public void passarParaTeste(View v){
        Intent i = new Intent(this,lp1.class);
        startActivity(i);
    }
    public void pegarArray(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Profissao");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot d : snapshot.getChildren()) {
                    Profissao p = d.getValue(Profissao.class);

                            if(p.getId() == ido){
                                toper.add(p);
                            }
                }
                if(toper.isEmpty()){
                print("Não fez le teste");
                }
                if(!toper.isEmpty()){

                    historico.roberto= toper;
                    passarParaHistorico();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    public void historicoLegal(View view){ mp.stop();pegarArray(); }
    public void passarParaHistorico(){
        Intent i = new Intent(this,historico.class);
        startActivity(i);
    }
}