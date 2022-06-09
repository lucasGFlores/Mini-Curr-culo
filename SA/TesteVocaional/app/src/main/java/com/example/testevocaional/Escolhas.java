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

import java.util.ArrayList;
import java.util.Objects;

public class Escolhas extends AppCompatActivity {
    static String login,senha;
    static int id;
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
    public void pegarArray(int ido){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("trampo");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                boolean foi = false;
                ArrayList<Profissao> list = new ArrayList<>();
                for(DataSnapshot d : snapshot.getChildren()){
                    Profissao t = d.getValue(Profissao.class);
                    if(t.getId() == ido ){
                        list.add(t);
                        foi = true;
                    }
                }
                if(foi) {
                    historico.list = list;
                    passarParaHistorico();
                }else if (!foi){
                    print("algo de certo está errado!!!");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
    public void historicoLegal(View view){
        pegarArray(id);
    }
    public void passarParaHistorico(){
        Intent i = new Intent(this,historico.class);

        startActivity(i);
    }
}