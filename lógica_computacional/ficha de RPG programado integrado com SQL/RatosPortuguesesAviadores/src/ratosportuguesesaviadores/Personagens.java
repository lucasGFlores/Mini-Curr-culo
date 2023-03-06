/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratosportuguesesaviadores;

/**
 *
 * @author lucas_g_flores
 */
public class Personagens {
int id,nivel,vida,vidaMaxima;
String classe,raca,nome,nome_do_usuario;
Status status;

    public Personagens(int id, int nivel, int vida, int vidaMaxima, String classe, String raca, String nome, String nome_do_usuario, Status status) {
        this.id = id;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
        this.classe = classe;
        this.raca = raca;
        this.nome = nome;
        this.nome_do_usuario = nome_do_usuario;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_do_usuario() {
        return nome_do_usuario;
    }

    public void setNome_do_usuario(String nome_do_usuario) {
        this.nome_do_usuario = nome_do_usuario;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    

 
}
