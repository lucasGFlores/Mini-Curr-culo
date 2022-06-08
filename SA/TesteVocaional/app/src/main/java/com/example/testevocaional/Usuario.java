package com.example.testevocaional;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Random;

public class Usuario {
    int id;
    String login,senha;
    ArrayList<Profissao> res = new ArrayList<>();


    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario() {
    }

    public ArrayList<Profissao> getRes() {
        return res;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setRes(ArrayList<Profissao> res) {
        this.res = res;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public void salvar_bd(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.child("Usuario").child(login).setValue(this);
    }
}
