package com.example.testevocaional;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Resultado extends AppCompatActivity {
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
    Profissao medicop = new Profissao("Médico","", medico);
    Profissao traficantep = new Profissao("Traficante","", traficante);
    Profissao galo_de_brigap = new Profissao("Criador de galo de briga","", criador_de_galo_de_briga);
    Profissao pedreirop = new Profissao("Pedreiro","", pedreiro);
    Profissao engenheirop = new Profissao("Engenheiro","Orçar,planejar, executar obras/criar sistemas e processos mais eficazes engenheiros utilizam da lógica, bom senso e pensamento analítico para solucionar desafios reais.", engenheiro);
    Profissao eletricistap = new Profissao("Eletricista","", eletricista);
    Profissao advogadop = new Profissao("Advogado","", advogado);
    Profissao bicheirop = new Profissao("Bicheiro","", bicheiro);
    Profissao veterinariop = new Profissao("Veterinário","", veterinario);
    Profissao enfermeirop = new Profissao("Enfermeiro","", enfermeiro);
    Profissao programadorp= new Profissao("Programador","", programador);
    Profissao policialp= new Profissao("Policial","", policial);
    Profissao mecanicop= new Profissao("Mecânico","", mecanico);

    ArrayList<Float> roger = new ArrayList<Float>(); //valor das profissões

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