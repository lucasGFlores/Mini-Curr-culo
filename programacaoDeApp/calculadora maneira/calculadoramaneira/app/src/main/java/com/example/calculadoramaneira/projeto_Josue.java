package com.example.calculadoramaneira;

import androidx.appcompat.app.AppCompatActivity;

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
        if(rat.isChecked()){
        //area total 2*Ab+n*F
        }
        else if(rab.isChecked()){
        //area da base (At - n * F)/2
        }
        else if(rabv.isChecked()){
        //area da base pelo volume
        }
        else if(rnl.isChecked()){
        //numero de lados N =  At - (2*Ab)/F
        }
        else if(raf.isChecked()){
        //area da face F = (At - 2*Ab)
        }
        else if(rv.isChecked()){
        //Volume  V = Ab*H
        }
        else if(ra.isChecked()){
        //altura H = V/Ab
        }
    }
}