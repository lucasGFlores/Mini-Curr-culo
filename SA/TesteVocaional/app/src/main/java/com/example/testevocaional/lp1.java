package com.example.testevocaional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class lp1 extends AppCompatActivity {
    ImageView m1, p1, g1, b1, m2, p2, g2, b2, m3, p3, g3, b3, m4, p4, g4, b4;
    ImageView m1v,p1v,b1v,g1v,m2v,p2v,g2v,b2v,m3v,p3v,g3v,b3v,m4v,p4v,g4v,b4v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_lp1);
        m1 = findViewById(R.id.magra_cheia);
        m1v = findViewById(R.id.magro_vazio);
        p1 = findViewById(R.id.palito_cheia);
        p1v = findViewById(R.id.palito_vazio);
        g1 = findViewById(R.id.gorda_cheia);
        g1v = findViewById(R.id.gorda_vazia);
        b1 = findViewById(R.id.obesa_cheia);
        b1v = findViewById(R.id.obesa_vazia);
        m2 = findViewById(R.id.magro_cheio2);
        m2v = findViewById(R.id.magra_vazia2);
        p2 = findViewById(R.id.palito_cheia2);
        p2v = findViewById(R.id.palito_vazia2);
        g2 = findViewById(R.id.gorda_cheia2);
        g2v = findViewById(R.id.gorda_vazia2);
        b2 = findViewById(R.id.obesa_cheia2);
        b2v = findViewById(R.id.obesa_vazia2);
        m3 = findViewById(R.id.magro_cheio3);
        m3v = findViewById(R.id.magra_vazia3);
        p3 = findViewById(R.id.palito_cheia3);
        p3v = findViewById(R.id.palito_vazia3);
        g3 = findViewById(R.id.gorda_cheia3);
        g3v = findViewById(R.id.gorda_vazia3);
        b3 = findViewById(R.id.obesa_cheia3);
        b3v = findViewById(R.id.obesa_vazia3);
        m4 = findViewById(R.id.magro_cheio4);
        m4v = findViewById(R.id.magra_vazia4);
        p4 = findViewById(R.id.palito_cheia4);
        p4v = findViewById(R.id.palito_vazia4);
        g4 = findViewById(R.id.gorda_cheia4);
        g4v = findViewById(R.id.gorda_vazia4);
        b4 = findViewById(R.id.obesa_cheia4);
        b4v = findViewById(R.id.obesa_vazia4);

        inviq1();
        inviq2();
        inviq3();
        inviq4();
    }

    public void inviq1() {
        m1.setVisibility(View.INVISIBLE);
        p1.setVisibility(View.INVISIBLE);
        g1.setVisibility(View.GONE);
        b1.setVisibility(View.GONE);
    }

    public void inviq2() {
        m2.setVisibility(View.GONE);
        p2.setVisibility(View.GONE);
        g2.setVisibility(View.GONE);
        b2.setVisibility(View.GONE);
    }

    public void inviq3() {
        m3.setVisibility(View.GONE);
        p3.setVisibility(View.GONE);
        g3.setVisibility(View.GONE);
        b3.setVisibility(View.GONE);
    }

    public void inviq4() {
        m4.setVisibility(View.GONE);
        p4.setVisibility(View.GONE);
        g4.setVisibility(View.GONE);
        b4.setVisibility(View.GONE);
    }

    public void m1(View v){
        // bolinha pequena da primeira pergunta
        inviq1();
        m1.setVisibility(View.VISIBLE);
        Toast.makeText(this,"roberto",Toast.LENGTH_LONG).show();
        //+2 em medicina por exemplo
    }
    public void p1(View v) {
        //bolinha do lado da pequena da primeira questão
    inviq1();
    p1.setVisibility(View.VISIBLE);
    Toast.makeText(this,"penes",Toast.LENGTH_LONG).show();
    // pontuação da bolinha
    }
    public void g1(View v){
        //bolinha  do lado da último
        inviq1();
        g1.setVisibility(View.VISIBLE);
    }
    public void b1(View v){
        //a ultima da direita da primeira questão
        inviq1();
        b1.setVisibility(View.VISIBLE);
    }
    public  void m2(View v){
        inviq2();
        m2.setVisibility(View.VISIBLE);
    }
    public  void p2(View v){
        inviq2();
        p2.setVisibility(View.VISIBLE);
    }
    public  void g2(View v){
        inviq2();
        g2.setVisibility(View.VISIBLE);
    }
    public  void b2(View v){
        inviq2();
        b2.setVisibility(View.VISIBLE);
    }
    public  void m3(View v){
        inviq3();
        m3.setVisibility(View.VISIBLE);
    }
    public  void p3(View v){
        inviq3();

        p3.setVisibility(View.VISIBLE);
    }
    public  void g3(View v){
        inviq3();
        g3.setVisibility(View.VISIBLE);
    }
    public  void b3(View v){
        inviq3();
        b3.setVisibility(View.VISIBLE);
    }
    public void m4(View v){
        inviq4();
        m4.setVisibility(View.VISIBLE);
    }
    public void p4(View v){
        inviq4();
        p4.setVisibility(View.VISIBLE);
    }
    public void g4(View v){
        inviq4();
        g4.setVisibility(View.VISIBLE);
    }
    public void b4(View v){
        inviq4();
        b4.setVisibility(View.VISIBLE);
        int s = b4.getVisibility();
        //Toast.makeText(this,s+"",Toast.LENGTH_LONG).show(); descobrir o valor para visível, é 0

    }
    public void passar(View v){
        if(b4.getVisibility() == View.VISIBLE){
            Toast.makeText(this,"funcionou penes",Toast.LENGTH_LONG);
        }
        if(m1.getVisibility() == View.VISIBLE || p1.getVisibility() == View.VISIBLE || g1.getVisibility() == View.VISIBLE || b1.getVisibility() == View.VISIBLE){
            if(m2.getVisibility() == View.VISIBLE || p2.getVisibility() == View.VISIBLE || g2.getVisibility() == View.VISIBLE || b2.getVisibility() == View.VISIBLE){
                if(m3.getVisibility() == View.VISIBLE || p3.getVisibility() == View.VISIBLE || g3.getVisibility() == View.VISIBLE || b3.getVisibility() == View.VISIBLE){
                 if(m4.getVisibility() == View.VISIBLE || p4.getVisibility() == View.VISIBLE || g4.getVisibility() == View.VISIBLE || b4.getVisibility() == View.VISIBLE ){
                     Intent i = new Intent(this,lp2.class);
                     startActivity(i);
                 }
                }
            }
        }
        else{
            Toast.makeText(this,"Responda tudo né porra",Toast.LENGTH_LONG).show();
        }
    }
}