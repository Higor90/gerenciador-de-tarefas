package com.estudo.gerenciador_de_tarefas.aplicativo;

import com.estudo.gerenciador_de_tarefas.dominio.RepositorioDaTarefa;
import com.estudo.gerenciador_de_tarefas.dominio.TarefaId;
import com.estudo.gerenciador_de_tarefas.dominio.TarefaNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DeletarTarefa {
    private final RepositorioDaTarefa repositorio;

    public DeletarTarefa(RepositorioDaTarefa repositorio) {
        this.repositorio = repositorio;
    }

    public void execute(TarefaId tarefaId){
    if (repositorio.findById(tarefaId).isEmpty()){
        throw new TarefaNotFoundException(tarefaId);
    }
    repositorio.delete(tarefaId);
    }
}
