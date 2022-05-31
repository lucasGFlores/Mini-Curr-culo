package com.example.testevocaional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class resultado extends AppCompatActivity {
    int medico = 0;
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
    ArrayList<Integer> roger = new ArrayList<Integer>(); //valor das profissões

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        TheSabidom(medico,engenheiro,eletricista,advogado,bicheiro,criador_de_galo_de_briga,pedreiro,veterinario,enfermeiro,traficante,programador,policial,mecanico);
    }
    public void TheSabidom(int medico,int engenheiro,int eletricista,int advogado,int bicheiro,int criador_de_galo_de_briga,int pedreiro,int veterinario,int enfermeiro,int traficante,int programador,int policial,int mecanico){

        roger.add(medico);
        roger.add(engenheiro);
        roger.add(eletricista);
        roger.add(advogado);
        roger.add(bicheiro);
        roger.add(criador_de_galo_de_briga);
        roger.add(pedreiro);
        roger.add(veterinario);
        roger.add(enfermeiro);
        roger.add(traficante);
        roger.add(programador);
        roger.add(policial);
        roger.add(mecanico);
        int comparas = 0;
        for(int i : roger){
            if(comparas > i){
            comparas = i;
            }
        }
        int[] bla = roger.stream().mapToInt(i -> i).toArray();
        Arrays.sort(bla, Collections.reverseOrder());

    }
}