package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView pe2, t2;
    ImageView pa2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pe2 = findViewById(R.id.pedra2);
        pa2 = findViewById(R.id.papel2);
        t2 = findViewById(R.id.tesoura2);
        pe2.setVisibility(View.INVISIBLE);
        pa2.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);

    }

    public void pedra(View v) {
        int escolha;
        escolha = 1;
        horaDoDuelo(escolha);
    }

    public void papel(View v) {
        int escolha;
        escolha = 2;
        horaDoDuelo(escolha);
    }

    public void tesoura(View v) {
        int escolha;
        escolha = 3;
        horaDoDuelo(escolha);
    }

    public void horaDoDuelo(int escolha) {
        Random du = new Random();
        int du2 = du.nextInt(3)+1;
        Toast.makeText(getApplicationContext(), "funfando", Toast.LENGTH_LONG);
        switch (du2) {
            case 1:
                pe2.setVisibility(View.VISIBLE);
                break;
            case 2:
                pa2.setVisibility(View.VISIBLE);
                break;
            case 3:
                t2.setVisibility(View.VISIBLE);
                break;
        }
        if (escolha == du2) {
           Toast toast = Toast.makeText(getApplicationContext(),"Empate caralho", Toast.LENGTH_LONG);
            toast.show();
            limpar();
        } else if (escolha == 1 && du2 == 2) {derrota();
        } else if (escolha == 1 && du2 == 3) {vitoria();
        } else if (escolha == 2 && du2 == 1) {vitoria();
        } else if (escolha == 2 && du2 == 3) {derrota();
        } else if (escolha == 3 && du2 == 1) {derrota();
        } else if (escolha == 3 && du2 == 2) { vitoria();

        }
    }
    public void derrota(){
        Intent i = new Intent (this,derrota.class );
        startActivity(i);
    }
    public void vitoria(){
        Intent i = new Intent (this, vitoria.class);
        startActivity(i);
    }
    public void limpar(){
        pe2.setVisibility(View.INVISIBLE);
        pa2.setVisibility(View.INVISIBLE);
        t2.setVisibility(View.INVISIBLE);
    }
}