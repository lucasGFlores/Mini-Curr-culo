package com.example.testevocaional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class lp3 extends AppCompatActivity {
    ImageView m9, p9, g9, b9, m10, p10, g10, b10, m11, p11, g11, b11, m12, p12, g12, b12;
    ImageView m9v,p9v,b9v,g9v,m10v,p10v,g10v,b10v,m11v,p11v,g11v,b11v,m12v,p12v,g12v,b12v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lp3);
        getSupportActionBar().hide();
        m9 = findViewById(R.id.magra_cheia9);
        m9v = findViewById(R.id.magro_vazia9);
        p9 = findViewById(R.id.palito_cheia9);
        p9v = findViewById(R.id.palito_vazia9);
        g9 = findViewById(R.id.gorda_cheia9);
        g9v = findViewById(R.id.gorda_vazia9);
        b9 = findViewById(R.id.obesa_cheia9);
        b9v = findViewById(R.id.obesa_vazia9);
        m10 = findViewById(R.id.magro_cheia10);
        p10 = findViewById(R.id.palito_cheia10);
        g10 = findViewById(R.id.gorda_cheia10);
        b10 = findViewById(R.id.obesa_cheia10);
        m10v = findViewById(R.id.magra_vazia10);
        p10v = findViewById(R.id.palito_vazia10);
        g10v = findViewById(R.id.gorda_vazia10);
        b10v = findViewById(R.id.obesa_vazia10);
        m11v = findViewById(R.id.magra_vazia11);
        p11v = findViewById(R.id.palito_vazia11);
        g11v = findViewById(R.id.gorda_vazia11);
        b11v = findViewById(R.id.obesa_vazia11);
        m12v = findViewById(R.id.magra_vazia12);
        p12v = findViewById(R.id.palito_vazia12);
        g12v = findViewById(R.id.gorda_vazia12);
        b12v = findViewById(R.id.obesa_vazia12);
        m11 = findViewById(R.id.magro_cheia11);
        p11 = findViewById(R.id.palito_cheia11);
        g11 = findViewById(R.id.gorda_cheia11);
        b11 = findViewById(R.id.obesa_cheia11);
        m12 = findViewById(R.id.magro_cheia12);
        p12 = findViewById(R.id.palito_cheia12);
        g12 = findViewById(R.id.gorda_cheia12);
        b12 = findViewById(R.id.obesa_cheia12);
        inviq9();
        inviq10();
        inviq11();
        inviq12();
    }
    public void inviq9(){
        m9.setVisibility(View.INVISIBLE);
        p9.setVisibility(View.INVISIBLE);
        g9.setVisibility(View.INVISIBLE);
        b9.setVisibility(View.INVISIBLE);
    }
    public void inviq10(){
        m10.setVisibility(View.INVISIBLE);
        p10.setVisibility(View.INVISIBLE);
        g10.setVisibility(View.INVISIBLE);
        b10.setVisibility(View.INVISIBLE);
    }
    public void inviq11(){
        m11.setVisibility(View.INVISIBLE);
        p11.setVisibility(View.INVISIBLE);
        g11.setVisibility(View.INVISIBLE);
        b11.setVisibility(View.INVISIBLE);
    }
    public void inviq12(){
        m12.setVisibility(View.INVISIBLE);
        p12.setVisibility(View.INVISIBLE);
        g12.setVisibility(View.INVISIBLE);
        b12.setVisibility(View.INVISIBLE);
    }
    public void m9(View v){
        inviq9();
        m9.setVisibility(View.VISIBLE);

    }
    public void p9(View v){
        inviq9();
        p9.setVisibility(View.VISIBLE);

    }
    public void g9(View v){
        inviq9();
        g9.setVisibility(View.VISIBLE);

    }
    public void b9(View v){
        inviq9();
        b9.setVisibility(View.VISIBLE);

    }
    public void m10(View v){
        inviq10();
        m10.setVisibility(View.VISIBLE);

    }
    public void p10(View v){
        inviq10();
        p10.setVisibility(View.VISIBLE);

    }
    public void g10(View v){
        inviq10();
        g10.setVisibility(View.VISIBLE);

    }
    public void b10(View v){
        inviq10();
        b10.setVisibility(View.VISIBLE);

    }
    public void m11(View v){
        inviq11();
        m11.setVisibility(View.VISIBLE);
    }
    public void p11(View v){
        inviq11();
        p11.setVisibility(View.VISIBLE);
    }
    public void g11(View v){
        inviq11();
        g11.setVisibility(View.VISIBLE);
    }
    public void b11(View v){
        inviq11();
        b11.setVisibility(View.VISIBLE);
    }
    public void m12(View v){
        inviq12();
        m12.setVisibility(View.VISIBLE);
    }
    public void p12(View v){
        inviq12();
        p12.setVisibility(View.VISIBLE);
    }
    public void g12(View v){
        inviq12();
        g12.setVisibility(View.VISIBLE);
    }
    public void b12(View v){
        inviq12();
        b12.setVisibility(View.VISIBLE);
    }
    public void passar(View v){
        if(checar()) {
            Intent i = new Intent(this, lp4.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this, "Responda tudo né porra", Toast.LENGTH_LONG).show();
        }
    }
    public boolean checar() {
        boolean i = false;
        if (m9.getVisibility() == View.VISIBLE || p9.getVisibility() == View.VISIBLE || g9.getVisibility() == View.VISIBLE || b9.getVisibility() == View.VISIBLE) {
            if (m10.getVisibility() == View.VISIBLE || p10.getVisibility() == View.VISIBLE || g10.getVisibility() == View.VISIBLE || b10.getVisibility() == View.VISIBLE) {
                if (m11.getVisibility() == View.VISIBLE || p11.getVisibility() == View.VISIBLE || g11.getVisibility() == View.VISIBLE || b11.getVisibility() == View.VISIBLE) {
                    if (m12.getVisibility() == View.VISIBLE || p12.getVisibility() == View.VISIBLE || g12.getVisibility() == View.VISIBLE || b12.getVisibility() == View.VISIBLE) {
                        i = true;
                    }
                }
            }

        }
        return i;
    }
    public void voltar(View v){
        Intent i = new Intent(this,lp2.class);
        startActivity(i);
    }
}