package com.estudo.gerenciador_de_tarefas.aplicativo;

import com.estudo.gerenciador_de_tarefas.aplicativo.entrada.AtualizacaoDaTarefaEntrada;
import com.estudo.gerenciador_de_tarefas.aplicativo.saida.TarefaDeSaida;
import com.estudo.gerenciador_de_tarefas.dominio.RepositorioDaTarefa;
import com.estudo.gerenciador_de_tarefas.dominio.TarefaId;
import com.estudo.gerenciador_de_tarefas.dominio.TarefaNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AtualizacaoDaTarefa {
    private final RepositorioDaTarefa repositorioDaTarefa;

    public AtualizacaoDaTarefa(RepositorioDaTarefa repositorioDaTarefa) {
        this.repositorioDaTarefa = repositorioDaTarefa;
    }
    public TarefaDeSaida execute(TarefaId id, AtualizacaoDaTarefaEntrada entrada){
        var tarefa = repositorioDaTarefa.findById(id).orElseThrow(()-> new TarefaNotFoundException(id));
        tarefa.atualizacao(entrada.titulo(), entrada.descricao(), entrada.status());
        var atualizacao = repositorioDaTarefa.salva(tarefa);
        return TarefaDeSaida.from(atualizacao);
    }
}
