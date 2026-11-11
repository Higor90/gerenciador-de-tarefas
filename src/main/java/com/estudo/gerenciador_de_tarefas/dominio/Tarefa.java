package com.estudo.gerenciador_de_tarefas.dominio;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

import java.util.Optional;

@Getter
@Setter
public class Tarefa {
    private TarefaId id;
    private String titulo;
    private Optional<String> descricao;
    private statusTarefa status;

    public Tarefa(String titulo, Optional<String> descricao){
        Assert.notNull(titulo, "Titulo não pode ser nulo");

        this.id = new TarefaId();
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = statusTarefa.PENDENTE ;
    }

    public void atualizacao(Optional<String> titulo, Optional<String> descricao, Optional<String> status){
        titulo.ifPresent(this::setTitulo);
        descricao.ifPresent(d -> this.setDescricao(Optional.of(d)));
        status.ifPresent(this::setStatus);
    }

    private void setStatus( String s) {
    }

}