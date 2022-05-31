package com.example.testevocaional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class lp4 extends AppCompatActivity {
    ImageView m13,p13,g13,b13, m14,p14,g14,b14,m15,p15,g15,b15;
    ImageView mv13,pv13,gv13,bv13, mv14,pv14,gv14,bv14,mv15,pv15,gv15,bv15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_lp4);
        m13 = findViewById(R.id.magro_cheia13);
        p13 = findViewById(R.id.palito_cheia13);
        g13 = findViewById(R.id.gorda_cheia13);
        b13 = findViewById(R.id.obesa_cheia13);
        mv13 = findViewById(R.id.magra_vazia13);
        pv13 = findViewById(R.id.palito_vazia13);
        gv13 = findViewById(R.id.gorda_vazia13);
        bv13 = findViewById(R.id.obesa_vazia13);
        m14 = findViewById(R.id.magra_cheia14);
        p14 = findViewById(R.id.palito_cheia14);
        g14 = findViewById(R.id.gorda_cheia14);
        b14 = findViewById(R.id.obesa_cheia14);
        mv14 = findViewById(R.id.magra_vazia14);
        pv14 = findViewById(R.id.palito_vazia14);
        gv14 = findViewById(R.id.gorda_vazia14);
        bv14 = findViewById(R.id.obesa_vazia14);
        m15 = findViewById(R.id.magro_cheio15);
        p15 = findViewById(R.id.palito_cheio15);
        g15 = findViewById(R.id.gorda_cheia15);
        b15 = findViewById(R.id.obesa_cheio15);
        mv15 = findViewById(R.id.magro_vazio15);
        pv15 = findViewById(R.id.palito_vazio15);
        gv15 = findViewById(R.id.gorda_vazia15);
        bv15 = findViewById(R.id.obesa_vazia15);
        inviq13();
        inviq14();
        inviq15();
    }
    public void inviq13(){
        m13.setVisibility(View.INVISIBLE);
        p13.setVisibility(View.INVISIBLE);
        g13.setVisibility(View.INVISIBLE);
        b13.setVisibility(View.INVISIBLE);
    }
    public void inviq14(){
        m14.setVisibility(View.INVISIBLE);
        p14.setVisibility(View.INVISIBLE);
        g14.setVisibility(View.INVISIBLE);
        b14.setVisibility(View.INVISIBLE);
    }
    public void inviq15(){
        m15.setVisibility(View.INVISIBLE);
        p15.setVisibility(View.INVISIBLE);
        g15.setVisibility(View.INVISIBLE);
        b15.setVisibility(View.INVISIBLE);
    }
    public void m13(View v){
        inviq13();
        m13.setVisibility(View.VISIBLE);
    }
    public void p13(View v){
        inviq13();
        p13.setVisibility(View.VISIBLE);
    }
    public void g13(View v){
        inviq13();
        g13.setVisibility(View.VISIBLE);
    }
    public void b13(View v){
        inviq13();
        b13.setVisibility(View.VISIBLE);
    }
    public void m14(View v){
        inviq14();
        m14.setVisibility(View.VISIBLE);
    }
    public void p14(View v){
        inviq14();
        p14.setVisibility(View.VISIBLE);
    }
    public void g14(View v){
        inviq14();
        g14.setVisibility(View.VISIBLE);
    }
    public void b14(View v){
        inviq14();
        b14.setVisibility(View.VISIBLE);
    }
    public void m15(View v){
        inviq15();
        m15.setVisibility(View.VISIBLE);
    }
    public void p15(View v){
        inviq15();
        p15.setVisibility(View.VISIBLE);
    }
    public void g15(View v){
        inviq15();
        g15.setVisibility(View.VISIBLE);
    }
    public void b15(View v){
        inviq15();
        b15.setVisibility(View.VISIBLE);
    }
    public void passar(View v){
        if(checar()) {
            Intent i = new Intent(this, resultado.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "Responda tudo né porra", Toast.LENGTH_LONG).show();
        }
    }
    public boolean checar() {
        boolean i = false;
        if (m13.getVisibility() == View.VISIBLE || p13.getVisibility() == View.VISIBLE || g13.getVisibility() == View.VISIBLE || b13.getVisibility() == View.VISIBLE) {
            if (m14.getVisibility() == View.VISIBLE || p14.getVisibility() == View.VISIBLE || g14.getVisibility() == View.VISIBLE || b14.getVisibility() == View.VISIBLE) {
                if (m15.getVisibility() == View.VISIBLE || p15.getVisibility() == View.VISIBLE || g15.getVisibility() == View.VISIBLE || b15.getVisibility() == View.VISIBLE) {

                        i = true;
                }
            }

        }
        return i;
    }
    public void voltar(View v){
        Intent i = new Intent(this,lp3.class);
        startActivity(i);
    }
}