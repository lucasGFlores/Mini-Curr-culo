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
public class Poderes {
    String nome,dado,vms,tdc,descricao;
    int id,nivel,id_do_personagem;

    public Poderes(String nome, String dado, String vms, String tdc, String descricao, int id, int nivel, int id_do_personagem) {
        this.nome = nome;
        this.dado = dado;
        this.vms = vms;
        this.tdc = tdc;
        this.descricao = descricao;
        this.id = id;
        this.nivel = nivel;
        this.id_do_personagem = id_do_personagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }

    public String getVms() {
        return vms;
    }

    public void setVms(String vms) {
        this.vms = vms;
    }

    public String getTdc() {
        return tdc;
    }

    public void setTdc(String tdc) {
        this.tdc = tdc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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

    public int getId_do_personagem() {
        return id_do_personagem;
    }

    public void setId_do_personagem(int id_do_personagem) {
        this.id_do_personagem = id_do_personagem;
    }

       
}
