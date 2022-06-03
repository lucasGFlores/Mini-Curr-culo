package com.example.testevocaional;

import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class lp2 extends AppCompatActivity {
    ImageView pv5, mv5, ov5, gv5, pv6, mv6, ov6, gv6, pv7, mv7, ov7, gv7, pv8, mv8, ov8, gv8;
    ImageView pc5, mc5, oc5, gc5, pc6, mc6, oc6, gc6, pc7, mc7, oc7, gc7, pc8, mc8, oc8, gc8;
    static float engenheiro;
    static float eletricista;
    static float advogado;
    static float bicheiro;
    static float criador_de_galo_de_briga;
    static float pedreiro;
    static float veterinario;
    static float enfermeiro;
    static float traficante;
    static float programador;
    static float policial;
    static float mecanico;
    static float medico;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lp2);



        pv5 = findViewById(R.id.palito_vazia5);
        mv5 = findViewById(R.id.magra_vazia5);
        ov5 = findViewById(R.id.obesa_vazia5);
        gv5 = findViewById(R.id.gorda_vazia5);
        pv6 = findViewById(R.id.palito_vazia6);
        mv6 = findViewById(R.id.magra_vazia6);
        ov6 = findViewById(R.id.obesa_vazia6);
        gv6 = findViewById(R.id.gorda_vazia6);
        pv7 = findViewById(R.id.palito_vazia7);
        mv7 = findViewById(R.id.magra_vazia7);
        ov7 = findViewById(R.id.obesa_vazia7);
        gv7 = findViewById(R.id.gorda_vazia7);
        pv8 = findViewById(R.id.palito_vazia8);
        mv8 = findViewById(R.id.magra_vazia8);
        ov8 = findViewById(R.id.obesa_vazia8);
        gv8 = findViewById(R.id.gorda_vazia8);

        pc5 = findViewById(R.id.palito_cheia5);
        mc5 = findViewById(R.id.magro_cheio5);
        oc5 = findViewById(R.id.obesa_cheia5);
        gc5 = findViewById(R.id.gorda_cheia5);
        pc6 = findViewById(R.id.palito_cheio6);
        mc6 = findViewById(R.id.magra_cheio6);
        oc6 = findViewById(R.id.obesa_cheia6);
        gc6 = findViewById(R.id.gorda_cheia6);
        pc7 = findViewById(R.id.palito_cheio7);
        mc7 = findViewById(R.id.magra_cheio7);
        oc7 = findViewById(R.id.obesa_cheia7);
        gc7 = findViewById(R.id.gorda_cheia7);
        pc8 = findViewById(R.id.palito_cheio8);
        mc8 = findViewById(R.id.magra_cheio8);
        oc8 = findViewById(R.id.obesa_cheia8);
        gc8 = findViewById(R.id.gorda_cheia8);
        inviq5();
        inviq6();
        inviq7();
        inviq8();
    }
    public void inviq5() {
        pc5.setVisibility(View.INVISIBLE);
        mc5.setVisibility(View.INVISIBLE);
        oc5.setVisibility(View.INVISIBLE);
        gc5.setVisibility(View.INVISIBLE);
    }
    public void inviq6() {
        pc6.setVisibility(View.INVISIBLE);
        mc6.setVisibility(View.INVISIBLE);
        oc6.setVisibility(View.INVISIBLE);
        gc6.setVisibility(View.INVISIBLE);
    }
    public void inviq7() {
        pc7.setVisibility(View.INVISIBLE);
        mc7.setVisibility(View.INVISIBLE);
        oc7. setVisibility(View.INVISIBLE);
        gc7. setVisibility(View.INVISIBLE);
    }
    public void inviq8() {
        pc8.setVisibility(View.INVISIBLE);
        mc8.setVisibility(View.INVISIBLE);
        oc8.setVisibility(View.INVISIBLE);
        gc8.setVisibility(View.INVISIBLE);
    }
    public void pv5 (View v) {
        inviq5();
        pc5.setVisibility(View.VISIBLE);
    }
    public void pv6 (View v) {
        inviq6();
        pc6.setVisibility(View.VISIBLE);
    }
    public void pv7 (View v) {
        inviq7();
        pc7.setVisibility(View.VISIBLE);

    }
    public void pv8 (View v){
        inviq8();
        pc8.setVisibility(View.VISIBLE);
    }
    public void mv5 (View v) {
        inviq5();
        mc5.setVisibility(View.VISIBLE);
    }
    public void mv6 (View v) {
        inviq6();
        mc6.setVisibility(View.VISIBLE);
    }
    public void mv7 (View v) {
        inviq7();
        mc7.setVisibility(View.VISIBLE);

    }
    public void mv8 (View v){
        inviq8();
        mc8.setVisibility(View.VISIBLE);
    }
    public void gv5 (View v) {
        inviq5();
        gc5.setVisibility(View.VISIBLE);
    }
    public void gv6 (View v) {
        inviq6();
        gc6.setVisibility(View.VISIBLE);
    }
    public void gv7 (View v) {
        inviq7();
        gc7.setVisibility(View.VISIBLE);

    }
    public void gv8 (View v){
        inviq8();
        gc8.setVisibility(View.VISIBLE);
    }
    public void oc5 (View v) {
        inviq5();
        oc5.setVisibility(View.VISIBLE);
    }
    public void ov6 (View v) {
        inviq6();
        oc6.setVisibility(View.VISIBLE);
    }
    public void ov7 (View v) {
        inviq7();
        oc7.setVisibility(View.VISIBLE);

    }
    public void ov8 (View v){
        inviq8();
        oc8.setVisibility(View.VISIBLE);
    }

    public int verificaq5(){ //verificar qual botão está selecionado e retornar ponto
        if(mc5.getVisibility() == VISIBLE){
            return 1;
        }
        else if(pc5.getVisibility() == VISIBLE){
            return 2;
        }
        else if(gc5.getVisibility() == VISIBLE){
            return 3;
        }
        else if(oc5.getVisibility() == VISIBLE){
            return 4;
        }
        return 0;
    }
    public int verificaq6(){
        if(mc6.getVisibility() == VISIBLE){
            return 1;
        }
        else if(pc6.getVisibility() == VISIBLE){
            return 2;
        }
        else if(gc6.getVisibility() == VISIBLE){
            return 7;
        }
        else if(oc6.getVisibility() == VISIBLE){
            return 4;
        }
        return 0;
    }
    public int verificaq7(){
        if(mc7.getVisibility() == VISIBLE){
            return 1;
        }
        else if(pc7.getVisibility() == VISIBLE){
            return 2;
        }
        else if(gc7.getVisibility() == VISIBLE){
            return 3;
        }
        else if(oc7.getVisibility() == VISIBLE){
            return 4;
        }
        return 0;
    }
    public int verificaq8(){
        if(mc8.getVisibility() == VISIBLE){
            return 1;
        }
        else if(pc8.getVisibility() == VISIBLE){
            return 2;
        }
        else if(gc8.getVisibility() == VISIBLE){
            return 3;
        }
        else if(oc8.getVisibility() == VISIBLE){
            return 4;
        }
        return 0;
    }
    public void somarFoda2(){
        veterinario += verificaq5()+verificaq7();
        medico +=verificaq6()+verificaq7();
        enfermeiro +=verificaq6()+verificaq7();
        policial +=verificaq6()+verificaq7();
        advogado += verificaq7();
        eletricista +=verificaq8();
        pedreiro+=verificaq8()*1.5;
        Toast.makeText(this, "Medicina : "+medico + "Programador : "+programador, Toast.LENGTH_SHORT).show();


    }


    public void passarmassa(View v){ //colocar no botão Próximo
     if(mc5.getVisibility() == VISIBLE || pc5.getVisibility() == VISIBLE || gc5.getVisibility() == VISIBLE || oc5.getVisibility() == VISIBLE){
        if(mc6.getVisibility() == VISIBLE || pc6.getVisibility() == VISIBLE || gc6.getVisibility() == VISIBLE || oc6.getVisibility() == VISIBLE){
            if(mc7.getVisibility() == VISIBLE || pc7.getVisibility() == VISIBLE || gc7.getVisibility() == VISIBLE || oc7.getVisibility() == VISIBLE){
                if(mc8.getVisibility() == VISIBLE || pc8.getVisibility() == VISIBLE || gc8.getVisibility() == VISIBLE || oc8.getVisibility() == VISIBLE ){
                    somarFoda2();
                    proxiga();
                    lp3.engenheiro = engenheiro;
                    lp3.eletricista = eletricista;
                    lp3.advogado = advogado;
                    lp3.bicheiro = bicheiro;
                    lp3.criador_de_galo_de_briga = criador_de_galo_de_briga;
                    lp3.pedreiro = pedreiro;
                    lp3.veterinario = veterinario;
                    lp3.enfermeiro = enfermeiro;
                    lp3.traficante = traficante;
                    lp3.programador = programador;
                    lp3.policial = policial;
                    lp3.mecanico  = mecanico;
                    lp3.medico = medico;

                }
            }
        }
    }
        else{
        Toast.makeText(this,"Responda tudo né porra",Toast.LENGTH_LONG).show();
    }
}
public void voltar(View v){
        Intent i = new Intent(this,lp1.class);
        startActivity(i);
}
public void proxiga(){
        Intent i = new Intent(this,lp3.class);
        startActivity(i);
}
}