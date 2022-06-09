package com.example.testevocaional;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
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
    static int ido;
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
    public void pegarArray(int id){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Profissao");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                ArrayList<Profissao> toper = new ArrayList<>();
                for(DataSnapshot d : snapshot.getChildren()) {
                    Profissao p = d.getValue(Profissao.class);
                    int reg = p.getId();
                            if(reg == id){
                                toper.add(p);
                            }
                }
                if(toper.isEmpty()){
                print("Não fez lee teste");
                }
                if(!toper.isEmpty()){

                    historico.list = toper;
                    passarParaHistorico();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    public void historicoLegal(View view){
        pegarArray(ido);
    }
    public void passarParaHistorico(){
        Intent i = new Intent(this,historico.class);

        startActivity(i);
    }
}