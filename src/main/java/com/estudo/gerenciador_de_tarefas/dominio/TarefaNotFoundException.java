package com.estudo.gerenciador_de_tarefas.dominio;

public class TarefaNotFoundException extends RuntimeException {
    public TarefaNotFoundException(TarefaId tarefaId) {
        super("Tarefa com id" +tarefaId + "não encontrada");
    }
}
