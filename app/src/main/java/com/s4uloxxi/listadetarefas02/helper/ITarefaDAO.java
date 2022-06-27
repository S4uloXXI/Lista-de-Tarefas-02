package com.s4uloxxi.listadetarefas02.helper;

import android.widget.LinearLayout;

import com.s4uloxxi.listadetarefas02.model.Tarefa;

import java.util.List;


public interface ITarefaDAO {

    public boolean salvar(Tarefa tarefa);
    public boolean atualizar(Tarefa tarefa);
    public boolean deletar(Tarefa tarefa);
    public List<Tarefa> listar();

}
