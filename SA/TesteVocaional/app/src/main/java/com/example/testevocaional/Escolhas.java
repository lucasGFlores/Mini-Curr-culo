package com.example.testevocaional;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class Escolhas extends AppCompatActivity {
    static String login,senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolhas);
    }
    public void print(String msg) {
        Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }
    public void passarParaTeste(View v){
        Intent i = new Intent(this,lp1.class);
        startActivity(i);
    }
    public void pegarArray(View v){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Usuario");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    if(d.getValue(Usuario.class).getLogin().equals(login) && d.getValue(Usuario.class).getSenha().equals(senha)){
                        if(d.getValue(Usuario.class).getRes().isEmpty() ){
                            print("Se Não te, histórico amigo");
                        }else {
                            historico.list = d.getValue(Usuario.class).getRes();
                            historicoLegal();
                        }
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    public void historicoLegal(){
        Intent i = new Intent(this,historico.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}