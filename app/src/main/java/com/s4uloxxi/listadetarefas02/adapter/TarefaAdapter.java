package com.s4uloxxi.listadetarefas02.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.s4uloxxi.listadetarefas02.R;
import com.s4uloxxi.listadetarefas02.model.Tarefa;

import java.util.List;


public class TarefaAdapter extends RecyclerView.Adapter<TarefaAdapter.MyViewHolder> {

    private List<Tarefa> listaTarefas;

    public TarefaAdapter(List<Tarefa> lista ) {
        this.listaTarefas = lista;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.lista_tarefa_adapter, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Tarefa tarefa = listaTarefas.get(position);
        holder.tarefa.setText( tarefa.getNomeTarefa() );
        Log.i("tarefaAdapter", tarefa.getNomeTarefa() );

    }

    @Override
    public int getItemCount() {
        return this.listaTarefas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tarefa;

        public MyViewHolder(View itemView) {
            super(itemView);

            tarefa = itemView.findViewById(R.id.textTarefa);

        }
    }

}


