package com.dgmodels.lojaRoupas.controller;

import com.dgmodels.lojaRoupas.dto.DadosAtualizarRoupa;
import com.dgmodels.lojaRoupas.dto.DadosCadastroRoupa;
import com.dgmodels.lojaRoupas.model.Roupa;
import com.dgmodels.lojaRoupas.repository.RoupaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roupa")
public class ControllerProduto {

    @Autowired
    private RoupaRepository roupaRepository;

    @PostMapping
    @Transactional
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados){
        roupaRepository.save(new Roupa (dados));
    }


    @GetMapping
    public List<Roupa> listarProdutos(){
        return roupaRepository.findAll();
    }

    @GetMapping("/nomeProduto/{nomeProduto}")
    public List<Roupa> listarProdutosPorNome(@PathVariable String nomeProduto){
        return roupaRepository.findByNomeProduto(nomeProduto);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletarProduto(@PathVariable Long id){
        roupaRepository.deleteById(id);
    }


    @PutMapping
    @Transactional
    public void atualizarProduto(@RequestBody DadosAtualizarRoupa novosDados){
        var roupa = roupaRepository.getReferenceById(novosDados.id());
        roupa.atualizarRoupa(novosDados);
        System.out.println(roupa.toString());

    }
}
