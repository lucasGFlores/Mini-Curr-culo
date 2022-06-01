package com.example.calculadoramaneira;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TelaConta extends AppCompatActivity {
    static int conta;
    EditText et1, et2, et3;
    TextView tv;
    double t1, t2, t3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_conta);
        getSupportActionBar().hide();
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        tv = findViewById(R.id.tv);
        atualizar();

    }

    public void atualizar() {
        tv.setVisibility(View.INVISIBLE);
        if (conta == 1) {
            et1.setHint("Área da Base");
            et2.setHint("Numero de lados");
            et3.setHint("Área da face lateral");

        } else if (conta == 2) {
            et1.setHint("Área Total");
            et2.setHint("Numero de lados");
            et3.setHint("Área da face lateral");
        } else if (conta == 3) {
            et1.setHint("Volume");
            et2.setHint("Altura");
            et3.setHint("Essa formula não precisa");
        } else if (conta == 4) {
            et1.setHint("Área da Total");
            et2.setHint("Área da base");
            et3.setHint("Área de uma das faces laterais");
        } else if (conta == 5) {
            et1.setHint("Área da Total");
            et2.setHint("Área da base");
            et3.setHint("Numero de lados da base");
        } else if (conta == 6) {
            et1.setHint("Área da Base");
            et2.setHint("Altura");
            et3.setHint("...");
        } else if (conta == 7) {
            et1.setHint("Área Total");
            et2.setHint("Altura");
            et3.setHint("...");
        }
    }

    public void fazerConta(View v) {

            t1 = Double.parseDouble(et1.getText().toString());
            t2 = Double.parseDouble(et2.getText().toString());

        switch (conta) {
            case 1:
                t3 = Double.parseDouble(et3.getText().toString());
                String resultado = String.valueOf(2 * t1 + t3 * t2);
                tv.setText(resultado);
                break;

            case 2:
                t3 = Double.parseDouble(et3.getText().toString());
                String resposta = String.valueOf((t1 - t2 * t3) / 2);
                tv.setText(resposta);
                break;

            case 4:
                t3 = Double.parseDouble(et3.getText().toString());
                String rob = String.valueOf((t1 - t2) / t3);
                tv.setText(rob);
                break;

            case 5:
                t3 = Double.parseDouble(et3.getText().toString());
                String robson = String.valueOf((t1 - t2 * 2) / t3);
                tv.setText(robson);
                break;

            case 3:
                t3 = 0;
                String jooj = String.valueOf((t1 / t2));
                tv.setText(jooj);
                break;


            case 7:
                String robetxompson = String.valueOf((t1 / t2));
                tv.setText(robetxompson);
                break;

            }
        if (conta == 6){
            double caldim;
            caldim = t1 * t2;
            tv.setText(caldim + "");
        }
        tv.setVisibility(View.VISIBLE);
    }
}