package com.example.testevocaional;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

public class Resultado extends AppCompatActivity {
Usuario u = new Usuario();
    static String login,senha;
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
    ImageView image;
    Profissao medicop = new Profissao("Médico","diagnosticar,tratar e curar.\n" +
            "médicos utilizam do bom senso, empatia e experiência para promover a saúde das pessoas ", medico,R.drawable.medico);

    Profissao traficantep = new Profissao("Traficante","bolar,vender e trocar tiro\n" +
            "traficantes utilizam de sua lógica e capacidade de venda para lucrar com produtos ilícitos como loló", traficante,R.drawable.traficante);

    Profissao galo_de_brigap = new Profissao("Criador de galo de briga"," cuidar,treinar e apostar\n" +
            "Criadores de galo utilizam de seu conhecimento e experiência para treinar e promover evento de rinhas entre galos ", criador_de_galo_de_briga,R.drawable.traficante);

    Profissao pedreirop = new Profissao("Pedreiro","construir,planejar e executar\n" +
            "pedreiros utilizam de seu conhecimento e lógica para executar a construção de edificios ", pedreiro,R.drawable.pedreiro);

    Profissao engenheirop = new Profissao("Engenheiro","Orçar,planejar, executar obras/criar sistemas e processos mais eficazes engenheiros utilizam da lógica, bom senso e pensamento analítico para solucionar desafios reais.", engenheiro,R.drawable.engenheiro);

    Profissao eletricistap = new Profissao("Eletricista"," executar,criar e consertar sistemas elétricos.\n" +
            "eletricistas usam da lógica para Executar planos de fiação elétrica para um bom funcionamento ", eletricista,R.drawable.eletricista);

    Profissao advogadop = new Profissao("Advogado"," orientar,defender e desenvolver argumentos.\n" +
            "advogados utilizam das suas capacidades sociais e conhecimentos sobre leis para defender os interesses de uma pessoa física ou jurídica",advogado,R.drawable.advogado);

    Profissao bicheirop = new Profissao("Bicheiro"," cobrar, organizar e sortear\n" +
            "bicheiros usam de suas capacidades sociais e lógicas para organizar e promover jogos de sorte vulgo jogo do bicho", bicheiro,R.drawable.bicheiro);

    Profissao veterinariop = new Profissao("Veterinário","diagnosticar,cuidar e tratar\n" +
            "veterinário utilizam seu bom senso e empatia com animais para promover a saúde dos animais", veterinario,R.drawable.veterinaria);

    Profissao enfermeirop = new Profissao("Enfermeiro","monitorar,auxiliar e prestar assistência\n" +
            "Enfermeiros utilizam de suas capacidades sociais e experiência para administrar medicamentos e auxiliar tratamentos médicos", enfermeiro,R.drawable.enfermeiro);

    Profissao programadorp= new Profissao("Programador","criar,planejar e executar sistemas de software/hardware\n" +
            "programadores usam de sua lógica para desenvolver sistemas de software/hardware para facilitar a vida de todos", programador,R.drawable.programador);

    Profissao policialp= new Profissao("Policial","Desencorajar a criminalidade,investiga e  garante a segurança da população\n" +
            "policiais usam de suas capacidades físicas e social para proteger a população de atos criminosos", policial,R.drawable.policial);

    Profissao mecanicop= new Profissao("Mecânico","criar, executar e reparar\n" +
            "mecânicos usam da lógica e experiência para fazer manutenção,troca e criação de máquinas", mecanico,R.drawable.mecanico);

    TextView nome,descricao;

    ArrayList<Float> roger = new ArrayList<Float>(); //valor das profissões
    ArrayList<Profissao> profissao = new ArrayList<Profissao>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        nome = findViewById(R.id.nomesin);
        descricao = findViewById(R.id.descricao);

        TheSabidom();

    }
    public void TheSabidom(){
        image = findViewById(R.id.imagem);
       // roger.add(policial/100);
        roger.add(mecanico);
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


        profissao.add(mecanicop);
        profissao.add(medicop);
        profissao.add(engenheirop);
        profissao.add(eletricistap);
        profissao.add(advogadop);
        profissao.add(bicheirop);
        profissao.add(galo_de_brigap);
        profissao.add(pedreirop);
        profissao.add(veterinariop);
        profissao.add(enfermeirop);
        profissao.add(traficantep);
        profissao.add(programadorp);
        profissao.add(policialp);


        Collections.sort(roger,Collections.reverseOrder());
        for(Profissao i : profissao){
            if(i.getResultado() == roger.get(0)){
                masterResultado(login,senha,i);
                nome.setText(i.getNome());
              image.setImageResource(i.getFoto());
                descricao.setText(i.getDescricao());

            }
        }

        }
    public void print(String msg){
        Toast t = Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG);
        t.show();
    }
        public void masterResultado(String login, String senha, Profissao i) {

            DatabaseReference refa = FirebaseDatabase.getInstance().getReference().child("Usuario");
            refa.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {

                    for(DataSnapshot d: snapshot.getChildren()){
                        print("pinto Funciona");
                        if(Objects.requireNonNull(d.getValue(Usuario.class)).getLogin().equals(login) && d.getValue(Usuario.class).getSenha().equals(senha)){
                            if(d.getValue(Usuario.class).getRes().isEmpty()) {
                                ArrayList<Profissao> lolo = new ArrayList<>();
                                lolo.add(i);
                                Usuario u = new Usuario(login, senha);
                                u.setRes(lolo);
                                u.salvar_bd();
                            }
                            else{
                                u = d.getValue(Usuario.class);
                                u.getRes().add(i);
                                u.salvar_bd();
                            }
                          (Objects.requireNonNull(d.getValue(Usuario.class))).salvar_bd();
                          break;
                        }
                    }
                }
                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            });
        }
        public void voltarEscolha(View v){
            Intent i = new Intent(this,Escolhas.class);
            startActivity(i);
        }
        public void refazer(View v){
        Intent i = new Intent(this,lp1.class);
        startActivity(i);
        }


}