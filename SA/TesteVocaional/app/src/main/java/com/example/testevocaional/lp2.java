package com.example.testevocaional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class lp2 extends AppCompatActivity {
    ImageView pv5, mv5, ov5, gv5, pv6, mv6, ov6, gv6, pv7, mv7, ov7, gv7, pv8, mv8, ov8, gv8;
    ImageView pc5, mc5, oc5, gc5, pc6, mc6, oc6, gc6, pc7, mc7, oc7, gc7, pc8, mc8, oc8, gc8;
    static int engenheiro2;
    static int eletricista2;
    static int advogado2;
    static int bicheiro2;
    static int criador_de_galo_de_briga2;
    static int pedreiro2;
    static int veterinario2;
    static int enfermeiro2;
    static int traficante2;
    static int programador2;
    static int policial2;
    static int mecanico2;
    int engenheiro1 = engenheiro2;
    int eletricista1 = eletricista2;
    int advogado1 = advogado2;
    int bicheiro1 = bicheiro2;
    int criador_de_galo_de_briga1 = criador_de_galo_de_briga2;
    int pedreiro1 = pedreiro2;
    int veterinario1 = veterinario2;
    int enfermeiro1 = enfermeiro2;
    int traficante1 = traficante2;
    int programador1 = programador2;
    int policial1 = policial2;
    int mecanico1  = mecanico2;

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



}