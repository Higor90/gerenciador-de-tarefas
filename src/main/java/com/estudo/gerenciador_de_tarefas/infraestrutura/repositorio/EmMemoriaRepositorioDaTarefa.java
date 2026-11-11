package com.estudo.gerenciador_de_tarefas.infraestrutura.repositorio;

import com.estudo.gerenciador_de_tarefas.dominio.RepositorioDaTarefa;
import com.estudo.gerenciador_de_tarefas.dominio.Tarefa;
import com.estudo.gerenciador_de_tarefas.dominio.TarefaId;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmMemoriaRepositorioDaTarefa implements RepositorioDaTarefa {

    private final Map<TarefaId, Tarefa> armazenamento = new HashMap<>();

    @Override
    public Tarefa salva(Tarefa tarefa) {
        armazenamento.put(tarefa.getId(),tarefa);
        return tarefa;
    }

    @Override
    public List<Tarefa> findAll() {
        return new ArrayList<>(armazenamento.values());
    }

    @Override
    public Optional<Tarefa> findById(TarefaId id) {
        return Optional.ofNullable(armazenamento.get(id));
    }

    @Override
    public void delete(TarefaId id) {
        armazenamento.remove(id);
    }
}
