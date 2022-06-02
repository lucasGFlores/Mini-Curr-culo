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
        startActivity(i);
    }

    public void passarFoda() {
        Intent i = new Intent(this, Escolhas.class);
        startActivity(i);

    }
    public void print(String msg){
        Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }

    public void verificadorFoda(View v) {
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("Usuatio");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String nomet = nome.getText().toString();
                String senhat = senha.getText().toString();
                for (DataSnapshot d : snapshot.getChildren()) {
                    if (d.getValue(Usuario.class).getLogin().equals(nomet) && d.getValue(Usuario.class).getSenha().equals(senhat)) {
                        passarFoda();
                    }
                }
                print("Senha ou login errado, Seu gay");
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

}