package com.example.testevocaional;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder> {
    SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy");
    Date data = new Date();
    Context context;

    Adaptador.OnItemClickListener listener;
    ArrayList<Profissao> list = new ArrayList<>();

    public Adaptador(Context context, ArrayList<Profissao> list,OnItemClickListener listener) {
        this.context = context;

        this.listener = listener;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate( R.layout.activity_layout,parent,false );
        return new Adaptador.MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Profissao profissao = list.get(position);
        holder.nome.setText(profissao.getNome());
        holder.data.setText(formataData.format(data));
        listener.onItemClick(profissao);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public interface OnItemClickListener {
        void onItemClick (Profissao profissao);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nome,data;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            data = itemView.findViewById(R.id.data);
            nome = itemView.findViewById(R.id.nomesin);

        }
    }
}
