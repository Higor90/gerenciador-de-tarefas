package com.estudo.gerenciador_de_tarefas.aplicativo.saida;

import com.estudo.gerenciador_de_tarefas.dominio.Tarefa;

import java.util.Optional;

public record TarefaDeSaida(String id, String titulo, Optional<String> descricao, String status) {


    public static TarefaDeSaida from(Tarefa tarefa) {
        return new TarefaDeSaida(tarefa.getId().id().toString(),
                tarefa.getTitulo(),
                tarefa.getDescricao(),
                tarefa.getStatus().name());
    }
}
