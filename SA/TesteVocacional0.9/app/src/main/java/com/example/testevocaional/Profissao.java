package com.example.testevocaional;

public class Profissao {
    String nome, descricao,foto;
    float resultado;
    public Profissao(String nome, String descricao,float resultado) {
        this.nome = nome;
        this.descricao = descricao;
        this.resultado = resultado;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
