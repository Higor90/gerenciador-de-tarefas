package com.estudo.gerenciador_de_tarefas.aplicativo.entrada;

import java.util.Optional;

public record AtualizacaoDaTarefaEntrada(Optional<String> titulo,
                                         Optional<String> descricao,
                                         Optional<String> status){


}
