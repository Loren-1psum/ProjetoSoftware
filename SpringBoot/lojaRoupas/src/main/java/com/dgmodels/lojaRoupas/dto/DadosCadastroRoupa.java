package com.dgmodels.lojaRoupas.dto;

import com.dgmodels.lojaRoupas.model.Tamanho;

public record DadosCadastroRoupa(
        String nomeProduto,
        String marca,
        Tamanho tamanho,
        double preco,
        int quantidade
) {
}
