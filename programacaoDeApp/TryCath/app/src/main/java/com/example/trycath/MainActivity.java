package com.example.trycath;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder alerta;
    EditText anoNasc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        anoNasc = findViewById(R.id.ano);
        alerta = new AlertDialog.Builder(this);

    }
    public void calcularIdade(View v){
        String msg = "2080 você tera ";
        try {
            int ano = Integer.parseInt(anoNasc.getText().toString());
            if(ano <1900){
                msg = "Okay você é um defunto que tem celular";
            } else if( ano > 2080){
                msg = "Okay viajante do futuro, como se esse app taria vivo até esses tempos";
            }
            else {
                int idade = 2022 - ano;
                msg += idade + "anos.";
            }
        }catch (Exception e){
            msg = "COLOCA CERTO FELA DE UMA PUTA";
        }

        alerta.setTitle("Idade");
        alerta.setMessage(msg);
        alerta.show();
    }
}