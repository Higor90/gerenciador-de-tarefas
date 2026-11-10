package com.estudo.gerenciador_de_tarefas.dominio;

import org.springframework.util.Assert;

import java.util.UUID;

public record TarefaId(UUID id) {
    public TarefaId{
        Assert.notNull(id, "id não pode ser nulo");
    }

    public TarefaId(){
        this(UUID.randomUUID());
    }

}
