package com.example.calculadoramaneira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class projeto_Josue extends AppCompatActivity {
    RadioButton rat, rab, rabv, rnl, raf, rv, ra;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projeto_josue);
        getSupportActionBar().hide();
        rat = findViewById(R.id.rb_at);
        rab = findViewById(R.id.rb_ab);
        rabv = findViewById(R.id.rb_abv);
        rnl = findViewById(R.id.rb_nl);
        raf = findViewById(R.id.rb_af);
        rv = findViewById(R.id.rb_v);
        ra = findViewById(R.id.rb_a);
    }
    public void prosseguir(View v){
        Intent i = new Intent(this, TelaConta.class);
        if(rat.isChecked()){// Área total At = 2*Ab + N*F
            TelaConta.conta = 1;
            startActivity(i);
        }
        else if(rab.isChecked()){
        //area da base (At - n * F)/2
            TelaConta.conta = 2;
            startActivity(i);
        }
        else if(rabv.isChecked()){
        //area da base pelo volume
            TelaConta.conta = 3;
            startActivity(i);
        }
        else if(rnl.isChecked()){
        //numero de lados N =  At - (2*Ab)/F
            TelaConta.conta = 4;
            startActivity(i);
        }
        else if(raf.isChecked()){
        //area da face F = (At - 2*Ab)
            TelaConta.conta = 5;
            startActivity(i);
        }
        else if(rv.isChecked()){
        //Volume  V = Ab*H
            TelaConta.conta = 6;
            startActivity(i);
        }
        else if(ra.isChecked()){
        //altura H = V/Ab
            TelaConta.conta = 7;
            startActivity(i);
        }
    }
}