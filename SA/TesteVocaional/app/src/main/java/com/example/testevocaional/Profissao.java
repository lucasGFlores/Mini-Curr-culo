package com.example.testevocaional;

public class Profissao {
    int id;
    String nome, descricao;
    int foto;
    int resultado;

    public Profissao( String nome, String descricao, int resultado, int foto) {

        this.nome = nome;
        this.descricao = descricao;
        this.foto = foto;
        this.resultado = resultado;
    }

    public Profissao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
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

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
