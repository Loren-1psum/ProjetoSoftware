package com.dgmodels.lojaRoupas.dto;

import com.dgmodels.lojaRoupas.model.Tamanho;

public record DadosAtualizarRoupa(
        Long id,
        String nomeProduto,
        Tamanho tamanho,
        String marca,
        double preco,
        int quantidade
        ){

}
