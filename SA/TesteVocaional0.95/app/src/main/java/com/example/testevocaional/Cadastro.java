package com.example.testevocaional;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Cadastro extends AppCompatActivity {
    EditText nome,senha,senha2;
    Usuario u = new Usuario();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        getSupportActionBar().hide();
        nome = findViewById(R.id.nomeNovo);
        senha = findViewById(R.id.novaSenha);
        senha2 = findViewById(R.id.novaSenha2);
    }

        public void passarTela(){
            Intent i = new Intent(this, Login.class);
            startActivity(i);
        }

    public void print(String msg){
        Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }

    public void verificar(View v) {
        String tnome = nome.getText().toString();
        String tsenha = senha.getText().toString();
        String tsenha2 = senha2.getText().toString();
        if (tsenha.equals(tsenha2) && tnome != "" && tsenha != "") {
            DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Usuario");
            ref.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    boolean i = false;
                    for (DataSnapshot d : snapshot.getChildren()) {


                        if (d.getValue(Usuario.class).getLogin().equals(tnome) && d.getValue(Usuario.class).getSenha().equals(tsenha)) {
                            i = true;
                            print("o usuário " + u.getLogin() + "existe");
                            break;
                        }
                    }
                    if (!i) {

                        print("Usuário não existe :D");
                        u.setLogin(tnome);
                        u.setSenha(tsenha);
                        u.salvar_bd();
                        passarTela();
                    }
                    nome.setText("");
                    senha.setText("");
                    senha2.setText("");
                }


                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    print("Failed to read value.");
                }
            });
        }
        else{
            Toast.makeText(this, "Tem algo errado fi", Toast.LENGTH_SHORT).show();
        }
    }
    }