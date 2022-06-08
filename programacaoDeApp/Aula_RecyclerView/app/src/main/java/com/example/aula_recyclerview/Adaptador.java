package com.example.aula_recyclerview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//receber uma lista e transformar num quadradinho na telaCardapio xml
public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {
    Context context;
    ArrayList<Prato> lista = new ArrayList<Prato>();
    Adaptador.OnItemClickListener listener; //click específico

    public Adaptador(Context context, ArrayList<Prato> lista, OnItemClickListener listener) {
        this.context = context;
        this.lista = lista;
        this.listener = listener;
    }

    @NonNull
    @Override
    //corno que enche a lista
    public Adaptador.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate( R.layout.layout,parent,false ); //encher a lista
        return new Adaptador.MyViewHolder(v);
    }

    @Override
    //bilhetinho do prato
    public void onBindViewHolder(@NonNull Adaptador.MyViewHolder holder, int position) {
        Prato prato = lista.get(position); //setar a posição
        holder.nome.setText( prato.nome); //isso chama o MyViewHolder, também conhecido como holder e vincula o holder com a informação do prato
        holder.ingredientes.setText(prato.ingredientes);
        holder.preco.setText(prato.preco+"");
        holder.itemView.setOnClickListener(view -> {
            listener.onItemClick(prato); //click no Prato malukooooooooo
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();//saber quantos cartões ele vai colocar
    }

    public interface OnItemClickListener {
        void onItemClick (Prato prato);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    //cara que tem visão, mostra as informações das variavel
            {
        TextView nome,ingredientes , preco;
        ImageView foto;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById((R.id.cardNome));
            ingredientes = itemView.findViewById(R.id.cardIngredientes);
            preco = itemView.findViewById(R.id.cardPreco);
            foto = itemView.findViewById(R.id.foto);
        }
    }
}
