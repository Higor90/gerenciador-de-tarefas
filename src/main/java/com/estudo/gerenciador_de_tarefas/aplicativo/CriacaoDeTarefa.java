package com.estudo.gerenciador_de_tarefas.aplicativo;

import com.estudo.gerenciador_de_tarefas.aplicativo.entrada.CriarTarefaDeEntrada;
import com.estudo.gerenciador_de_tarefas.aplicativo.saida.TarefaDeSaida;
import com.estudo.gerenciador_de_tarefas.dominio.RepositorioDaTarefa;
import com.estudo.gerenciador_de_tarefas.dominio.Tarefa;
import org.springframework.stereotype.Service;

@Service
public class CriacaoDeTarefa {
    private final RepositorioDaTarefa repositorio;

    public CriacaoDeTarefa(RepositorioDaTarefa repositorio){
        this.repositorio = repositorio;
    }
    public TarefaDeSaida execute(CriarTarefaDeEntrada entrada){
       var tarefa = new Tarefa(entrada.titulo(), entrada.descricao());
        var salvar = repositorio.salva(tarefa);
        return TarefaDeSaida.from(salvar);
    }
}
