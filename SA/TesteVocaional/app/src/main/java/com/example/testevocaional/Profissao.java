package com.example.testevocaional;

public class Profissao {
    String nome, descricao;
    int resultado;
    public Profissao(String nome, String descricao,int resultado) {
        this.nome = nome;
        this.descricao = descricao;
        this.resultado = resultado;
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

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
