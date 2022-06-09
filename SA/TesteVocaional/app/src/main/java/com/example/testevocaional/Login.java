package com.example.testevocaional;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Objects;

public class Login extends AppCompatActivity {

    EditText nome, senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        nome = findViewById(R.id.nome);
        senha = findViewById(R.id.passwd);

    }

    public void passarParaTelaDECriarConta(View v) {
        Intent i = new Intent(this, Cadastro.class);
        //i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void passarFoda() {
        Intent i = new Intent(this, Escolhas.class);
      //  i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);

    }

    public void print(String msg) {
        Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }
    public void baterDeTabela(View v){
        verificadorFoda();
    }

    public void verificadorFoda() {
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Usuario");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String nomea = nome.getText().toString();
                String senhaa = senha.getText().toString();
                boolean foi = false;
                print("Veio aqui hô");
                for (DataSnapshot d : snapshot.getChildren()) {
                    Usuario u = d.getValue(Usuario.class);
                    print(u.getLogin());
                   if (u.getLogin().equals(nomea) && u.getSenha().equals(senhaa)) {

                        lp4.login = nomea;
                        lp4.senha = senhaa;
                        Escolhas.login = nomea;
                        Escolhas.senha = senhaa;
                        historico.id = u.getId();
                        foi = true;
                        passarFoda();

                    }
                }
                if (!foi) {
                     print("Senha ou login errado, Seu gay");
                 }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

}