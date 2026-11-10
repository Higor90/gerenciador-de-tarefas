package com.estudo.gerenciador_de_tarefas.dominio;

import java.util.List;
import java.util.Optional;

public interface RepositorioDaTarefa {

    Tarefa salva(Tarefa tarefa);
    List<Tarefa> findAll();
    Optional<Tarefa> findById(TarefaId id);
    void delete(TarefaId id);
}
