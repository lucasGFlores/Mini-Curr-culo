package com.example.aula_recyclerview;

import android.widget.ImageView;

public class Prato {
    String nome;
    String ingredientes;
    float preco;
    ImageView foto;

    public Prato(String nome, String ingredientes, float preco, ImageView foto) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preco = preco;
        this.foto = foto;
    }

    public ImageView getFoto() {
        return foto;
    }

    public void setFoto(ImageView foto) {
        this.foto = foto;
    }

    public Prato(String nome, String ingredientes, float preco) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
