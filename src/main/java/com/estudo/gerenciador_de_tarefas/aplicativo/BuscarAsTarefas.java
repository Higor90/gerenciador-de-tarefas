package com.estudo.gerenciador_de_tarefas.aplicativo;

import com.estudo.gerenciador_de_tarefas.aplicativo.saida.TarefaDeSaida;
import com.estudo.gerenciador_de_tarefas.dominio.RepositorioDaTarefa;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BuscarAsTarefas {
    private final RepositorioDaTarefa repositorio;

    public BuscarAsTarefas(RepositorioDaTarefa repositorio){

        this.repositorio = repositorio;
    }

    public List<TarefaDeSaida> execute(){

        return repositorio.findAll().stream().map(TarefaDeSaida::from).toList();
    }
}
