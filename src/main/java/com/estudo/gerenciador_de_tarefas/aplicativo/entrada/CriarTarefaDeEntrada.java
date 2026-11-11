package com.estudo.gerenciador_de_tarefas.aplicativo.entrada;

import java.util.Optional;

public record CriarTarefaDeEntrada(String titulo, Optional<String> descricao) {
}
