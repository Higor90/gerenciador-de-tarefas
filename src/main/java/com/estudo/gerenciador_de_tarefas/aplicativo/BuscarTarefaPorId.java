package com.estudo.gerenciador_de_tarefas.aplicativo;

import com.estudo.gerenciador_de_tarefas.aplicativo.saida.TarefaDeSaida;
import com.estudo.gerenciador_de_tarefas.dominio.RepositorioDaTarefa;
import com.estudo.gerenciador_de_tarefas.dominio.TarefaId;
import com.estudo.gerenciador_de_tarefas.dominio.TarefaNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class BuscarTarefaPorId {
    private final RepositorioDaTarefa repositorio;

    public BuscarTarefaPorId(RepositorioDaTarefa repositorio) {
        this.repositorio = repositorio;
    }

    public TarefaDeSaida execute(TarefaId id){
        return repositorio.findById(id)
                .map(TarefaDeSaida::from)
                .orElseThrow(() -> new TarefaNotFoundException(id));
    }
}
