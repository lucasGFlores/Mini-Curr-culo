package com.example.testevocaional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class resultado extends AppCompatActivity {
    Profissao medico = new Profissao("Médico","", 0);
    Profissao traficante = new Profissao("Traficante","", 0);
    Profissao galo_de_briga = new Profissao("Criador de galo de briga","", 0);
    Profissao pedreiro = new Profissao("Pedreiro","", 0);
    Profissao engenheiro = new Profissao("Engenheiro","Orçar,planejar, executar obras/criar sistemas e processos mais eficazes engenheiros utilizam da lógica, bom senso e pensamento analítico para solucionar desafios reais.", 0);
    Profissao eletricista = new Profissao("Eletricista","", 0);
    Profissao advogado = new Profissao("Advogado","", 0);
    Profissao bicheiro = new Profissao("Bicheiro","", 0);
    Profissao veterinario = new Profissao("Veterinário","", 0);
    Profissao enfermeiro = new Profissao("Enfermeiro","", 0);
    Profissao programador= new Profissao("Programador","", 0);
    Profissao policial= new Profissao("Policial","", 0);
    Profissao mecanico= new Profissao("Mecânico","", 0);

    ArrayList<Integer> roger = new ArrayList<Integer>(); //valor das profissões

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
      //  TheSabidom(medico,engenheiro,eletricista,advogado,bicheiro,pedreiro,veterinario,enfermeiro,traficante,programador,policial,mecanico);
    }
   /* public void TheSabidom(int medico,int engenheiro,int eletricista,int advogado,int bicheiro,int criador_de_galo_de_briga,int pedreiro,int veterinario,int enfermeiro,int traficante,int programador,int policial,int mecanico){

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
       /*  int comparas = 0;
       for(int i : roger){
            if(comparas > i){
            comparas = i;
            }
        }
        int[] bla = roger.stream().mapToInt(i -> i).toArray();
        Arrays.sort(bla, Collections.reverseOrder());
        */

 //   }
}