package com.example.testevocaional;

import static android.view.View.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class lp1 extends AppCompatActivity {
    int engenheiro = 0;
    int eletricista = 0;
    int advogado = 0;
    int bicheiro = 0;
    int criador_de_galo_de_briga = 0;
    int pedreiro = 0;
    int veterinario = 0;
    int enfermeiro = 0;
    int traficante = 0;
    int programador = 0;
    int policial = 0;
    int mecanico  = 0;
    int medico = 0;
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
        m1.setVisibility(INVISIBLE);
        p1.setVisibility(INVISIBLE);
        g1.setVisibility(GONE);
        b1.setVisibility(GONE);
    }
    public void inviq2() {
        m2.setVisibility(GONE);
        p2.setVisibility(GONE);
        g2.setVisibility(GONE);
        b2.setVisibility(GONE);
    }
    public void inviq3() {
        m3.setVisibility(GONE);
        p3.setVisibility(GONE);
        g3.setVisibility(GONE);
        b3.setVisibility(GONE);
    }
    public void inviq4() {
        m4.setVisibility(GONE);
        p4.setVisibility(GONE);
        g4.setVisibility(GONE);
        b4.setVisibility(GONE);
    }
    public void m1(View v){
        // bolinha pequena da primeira pergunta
        inviq1();
        m1.setVisibility(VISIBLE);
        //Toast.makeText(this,"roberto",Toast.LENGTH_LONG).show();
        //+2 em medicina por exemplo
    }
    public void p1(View v) {
        //bolinha do lado da pequena da primeira questão
    inviq1();
    p1.setVisibility(VISIBLE);
    Toast.makeText(this,"penes",Toast.LENGTH_LONG).show();
    // pontuação da bolinha
    }
    public void g1(View v){
        //bolinha  do lado da último
        inviq1();
        g1.setVisibility(VISIBLE);
    }
    public void b1(View v){
        //a ultima da direita da primeira questão
        inviq1();
        b1.setVisibility(VISIBLE);
    }
    public  void m2(View v){
        inviq2();
        m2.setVisibility(VISIBLE);
    }
    public  void p2(View v){
        inviq2();
        p2.setVisibility(VISIBLE);
    }
    public  void g2(View v){
        inviq2();
        g2.setVisibility(VISIBLE);
    }
    public  void b2(View v){
        inviq2();
        b2.setVisibility(VISIBLE);
    }
    public  void m3(View v){
        inviq3();
        m3.setVisibility(VISIBLE);
    }
    public  void p3(View v){
        inviq3();

        p3.setVisibility(VISIBLE);
    }
    public  void g3(View v){
        inviq3();
        g3.setVisibility(VISIBLE);
    }
    public  void b3(View v){
        inviq3();
        b3.setVisibility(VISIBLE);
    }
    public void m4(View v){
        inviq4();
        m4.setVisibility(VISIBLE);
    }
    public void p4(View v){
        inviq4();
        p4.setVisibility(VISIBLE);
    }
    public void g4(View v){
        inviq4();
        g4.setVisibility(VISIBLE);
    }
    public void b4(View v){
        inviq4();
        b4.setVisibility(VISIBLE);
        int s = b4.getVisibility();
        //Toast.makeText(this,s+"",Toast.LENGTH_LONG).show(); descobrir o valor para visível, é 0

    }

    public void passar(View v){
        if(b4.getVisibility() == VISIBLE){
            Toast.makeText(this,"funcionou penes",Toast.LENGTH_LONG);
        }
        if(m1.getVisibility() == VISIBLE || p1.getVisibility() == VISIBLE || g1.getVisibility() == VISIBLE || b1.getVisibility() == VISIBLE){
            if(m2.getVisibility() == VISIBLE || p2.getVisibility() == VISIBLE || g2.getVisibility() == VISIBLE || b2.getVisibility() == VISIBLE){
                if(m3.getVisibility() == VISIBLE || p3.getVisibility() == VISIBLE || g3.getVisibility() == VISIBLE || b3.getVisibility() == VISIBLE){
                 if(m4.getVisibility() == VISIBLE || p4.getVisibility() == VISIBLE || g4.getVisibility() == VISIBLE || b4.getVisibility() == VISIBLE ){
                     somarLegal();
                     lp2.engenheiro = engenheiro;
                     lp2.eletricista = eletricista;
                     lp2.advogado = advogado;
                     lp2.bicheiro = bicheiro;
                     lp2.criador_de_galo_de_briga = criador_de_galo_de_briga;
                     lp2.pedreiro = pedreiro;
                     lp2.veterinario = veterinario;
                     lp2.enfermeiro = enfermeiro;
                     lp2.traficante = traficante;
                     lp2.programador = programador;
                     lp2.policial = policial;
                     lp2.mecanico  = mecanico;
                     lp2.medico = medico;
                     Intent i = new Intent(this,lp2.class);
                    // i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                     startActivity(i);

                 }
                }
            }
        }
        else{
            Toast.makeText(this,"Responda tudo né porra",Toast.LENGTH_LONG).show();
        }
    }
    public int verificaq1(){ //verificar qual botão está selecionado e retornar ponto
        if(m1.getVisibility() == VISIBLE){
            return -1;
        }
        else if(p1.getVisibility() == VISIBLE){
            return 1;
        }
        else if(g1.getVisibility() == VISIBLE){
            return 2;
        }
        else if(b1.getVisibility() == VISIBLE){
            return 3;
        }
        return 0;
    }
    public int verificaq2(){
        if(m2.getVisibility() == VISIBLE){
            return -1;
        }
        else if(p2.getVisibility() == VISIBLE){
            return 1;
        }
        else if(g2.getVisibility() == VISIBLE){
            return 2;
        }
        else if(b2.getVisibility() == VISIBLE){
            return 3;
        }
        return 0;
    }
    public int verificaq3(){
        if(m3.getVisibility() == VISIBLE){
            return -1;
        }
        else if(p3.getVisibility() == VISIBLE){
            return 1;
        }
        else if(g3.getVisibility() == VISIBLE){
            return 2;
        }
        else if(b3.getVisibility() == VISIBLE){
            return 3;
        }
        return 0;
    }
    public int verificaq4(){
        if(m4.getVisibility() == VISIBLE){
            return -1;
        }
        else if(p4.getVisibility() == VISIBLE){
            return 1;
        }
        else if(g4.getVisibility() == VISIBLE){
            return 2;
        }
        else if(b4.getVisibility() == VISIBLE){
            return 3;
        }
        return 0;
    }
    public void somarLegal(){
        medico += verificaq1()+verificaq2()+verificaq4();
        engenheiro +=verificaq2()+verificaq4();
        programador +=verificaq4()*2;
        medico +=verificaq2()+verificaq4();
        enfermeiro +=verificaq2()+verificaq3()+verificaq4();
        policial +=verificaq2()+verificaq3();
        pedreiro +=verificaq3()*1.2;
        eletricista+= verificaq4();
        mecanico +=verificaq4()*2;
    }
}