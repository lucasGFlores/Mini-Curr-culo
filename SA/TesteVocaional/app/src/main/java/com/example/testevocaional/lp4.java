package com.example.testevocaional;

import static android.view.View.VISIBLE;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collections;

import kotlinx.coroutines.channels.ProduceKt;

public class lp4 extends AppCompatActivity {
    static String login;
    static String senha;
    static int engenheiro;
    static int eletricista;
    static int advogado;
    static int bicheiro;
    static int criador_de_galo_de_briga;
    static int pedreiro;
    static int veterinario;
    static int enfermeiro;
    static int traficante;
    static int programador;
    static int policial;
    static int mecanico;
    static int medico;
    ImageView m13, p13, g13, b13, m14, p14, g14, b14, m15, p15, g15, b15;
    ImageView mv13, pv13, gv13, bv13, mv14, pv14, gv14, bv14, mv15, pv15, gv15, bv15;


    Profissao medicop = new Profissao("Médico", "diagnosticar,tratar e curar.\n" +
            "médicos utilizam do bom senso, empatia e experiência para promover a saúde das pessoas ", medico, R.drawable.medico);

    Profissao traficantep = new Profissao("Traficante", "bolar,vender e trocar tiro\n" +
            "traficantes utilizam de sua lógica e capacidade de venda para lucrar com produtos ilícitos como loló", traficante, R.drawable.traficante);

    Profissao galo_de_brigap = new Profissao("Criador de galo de briga", " cuidar,treinar e apostar\n" +
            "Criadores de galo utilizam de seu conhecimento e experiência para treinar e promover evento de rinhas entre galos ", criador_de_galo_de_briga, R.drawable.traficante);

    Profissao pedreirop = new Profissao("Pedreiro", "construir,planejar e executar\n" +
            "pedreiros utilizam de seu conhecimento e lógica para executar a construção de edificios ", pedreiro, R.drawable.pedreiro);

    Profissao engenheirop = new Profissao("Engenheiro", "Orçar,planejar, executar obras/criar sistemas e processos mais eficazes engenheiros utilizam da lógica, bom senso e pensamento analítico para solucionar desafios reais.", engenheiro, R.drawable.engenheiro);

    Profissao eletricistap = new Profissao("Eletricista", " executar,criar e consertar sistemas elétricos.\n" +
            "eletricistas usam da lógica para Executar planos de fiação elétrica para um bom funcionamento ", eletricista, R.drawable.eletricista);

    Profissao advogadop = new Profissao("Advogado", " orientar,defender e desenvolver argumentos.\n" +
            "advogados utilizam das suas capacidades sociais e conhecimentos sobre leis para defender os interesses de uma pessoa física ou jurídica", advogado, R.drawable.advogado);

    Profissao bicheirop = new Profissao("Bicheiro", " cobrar, organizar e sortear\n" +
            "bicheiros usam de suas capacidades sociais e lógicas para organizar e promover jogos de sorte vulgo jogo do bicho", bicheiro, R.drawable.bicheiro);

    Profissao veterinariop = new Profissao("Veterinário", "diagnosticar,cuidar e tratar\n" +
            "veterinário utilizam seu bom senso e empatia com animais para promover a saúde dos animais", veterinario, R.drawable.veterinaria);

    Profissao enfermeirop = new Profissao("Enfermeiro", "monitorar,auxiliar e prestar assistência\n" +
            "Enfermeiros utilizam de suas capacidades sociais e experiência para administrar medicamentos e auxiliar tratamentos médicos", enfermeiro, R.drawable.enfermeiro);

    Profissao programadorp = new Profissao("Programador", "criar,planejar e executar sistemas de software/hardware\n" +
            "programadores usam de sua lógica para desenvolver sistemas de software/hardware para facilitar a vida de todos", programador, R.drawable.programador);

    Profissao policialp = new Profissao("Policial", "Desencorajar a criminalidade,investiga e  garante a segurança da população\n" +
            "policiais usam de suas capacidades físicas e social para proteger a população de atos criminosos", policial, R.drawable.policial);

    Profissao mecanicop = new Profissao("Mecânico", "criar, executar e reparar\n" +
            "mecânicos usam da lógica e experiência para fazer manutenção,troca e criação de máquinas", mecanico, R.drawable.mecanico);


    ArrayList<Integer> roger = new ArrayList<>(); //valor das profissões
    ArrayList<Profissao> profissao = new ArrayList<>();


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

    public void inviq13() {
        m13.setVisibility(View.INVISIBLE);
        p13.setVisibility(View.INVISIBLE);
        g13.setVisibility(View.INVISIBLE);
        b13.setVisibility(View.INVISIBLE);
    }

    public void inviq14() {
        m14.setVisibility(View.INVISIBLE);
        p14.setVisibility(View.INVISIBLE);
        g14.setVisibility(View.INVISIBLE);
        b14.setVisibility(View.INVISIBLE);
    }

    public void inviq15() {
        m15.setVisibility(View.INVISIBLE);
        p15.setVisibility(View.INVISIBLE);
        g15.setVisibility(View.INVISIBLE);
        b15.setVisibility(View.INVISIBLE);
    }

    public void m13(View v) {
        inviq13();
        m13.setVisibility(View.VISIBLE);
    }

    public void p13(View v) {
        inviq13();
        p13.setVisibility(View.VISIBLE);
    }

    public void g13(View v) {
        inviq13();
        g13.setVisibility(View.VISIBLE);
    }

    public void b13(View v) {
        inviq13();
        b13.setVisibility(View.VISIBLE);
    }

    public void m14(View v) {
        inviq14();
        m14.setVisibility(View.VISIBLE);
    }

    public void p14(View v) {
        inviq14();
        p14.setVisibility(View.VISIBLE);
    }

    public void g14(View v) {
        inviq14();
        g14.setVisibility(View.VISIBLE);
    }

    public void b14(View v) {
        inviq14();
        b14.setVisibility(View.VISIBLE);
    }

    public void m15(View v) {
        inviq15();
        m15.setVisibility(View.VISIBLE);
    }

    public void p15(View v) {
        inviq15();
        p15.setVisibility(View.VISIBLE);
    }

    public void g15(View v) {
        inviq15();
        g15.setVisibility(View.VISIBLE);
    }

    public void b15(View v) {
        inviq15();
        b15.setVisibility(View.VISIBLE);
    }

    public int verificaq13() { //verificar qual botão está selecionado e retornar ponto
        if (m13.getVisibility() == VISIBLE) {
            return 1;
        } else if (p13.getVisibility() == VISIBLE) {
            return 2;
        } else if (g13.getVisibility() == VISIBLE) {
            return 3;
        } else if (b13.getVisibility() == VISIBLE) {
            return 4;
        }
        return 0;
    }

    public int verificaq14() {
        if (m14.getVisibility() == VISIBLE) {
            return 1;
        } else if (p14.getVisibility() == VISIBLE) {
            return 2;
        } else if (g14.getVisibility() == VISIBLE) {
            return 3;
        } else if (b14.getVisibility() == VISIBLE) {
            return 4;
        }
        return 0;
    }

    public int verificaq15() {
        if (m15.getVisibility() == VISIBLE) {
            return 1;
        } else if (p15.getVisibility() == VISIBLE) {
            return 2;
        } else if (g15.getVisibility() == VISIBLE) {
            return 3;
        } else if (b15.getVisibility() == VISIBLE) {
            return 4;
        }
        return 0;
    }

    public void somaLegal4() {
        advogado += verificaq13() + verificaq14();
        policial += verificaq15();
        traficante += verificaq15() * 2;
    }

    public void resultadoFoda(View v) {
        if (checar()) {
            somaLegal4();
            TheSabidom();
            Toast.makeText(this, "AQUIiiiiiiiiiiiiiiii", Toast.LENGTH_LONG).show();



        } else {
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

    public void voltar(View v) {
        Intent i = new Intent(this, lp3.class);
      //  i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void TheSabidom() {

        roger.add(policial);
        roger.add(mecanico);
        //roger.add(medico);
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
       //  profissao.add(medicop);
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


        roger.sort(Collections.reverseOrder());
        for (Profissao i : profissao) {
            if (i.getResultado() == roger.get(0)) {
                masterResultado(login, i);
                Toast.makeText(this, "oieeeeeeeeeeeeeeee", Toast.LENGTH_SHORT).show();
                break;

            }
        }


    }

    public void masterResultado(String login, Profissao i) {

        Resultado.i = i;
       pegarUserInfo(i);
        Toast.makeText(this, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", Toast.LENGTH_SHORT).show();
        Intent i2 = new Intent(this, Resultado.class);
        startActivity(i2);
    }
    public void pegarUserInfo(Profissao i){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("Usuario");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot d : snapshot.getChildren()){
                    Usuario u = d.getValue(Usuario.class);
                    if(u.getLogin().equals(login) && u.getSenha().equals(senha)){
                        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference();
                        i.setId(u.getId());
                        rootRef.child("Profissao").child(i.nome).setValue(i);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}