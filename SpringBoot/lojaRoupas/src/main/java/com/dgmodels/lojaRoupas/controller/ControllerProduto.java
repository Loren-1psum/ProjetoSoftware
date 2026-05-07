package com.dgmodels.lojaRoupas.controller;

import com.dgmodels.lojaRoupas.model.DadosCadastroRoupa;
import com.dgmodels.lojaRoupas.model.Roupa;
import com.dgmodels.lojaRoupas.repository.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roupa")
public class ControllerProduto {

    @Autowired
    private RoupaRepository roupaRepository;

    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroRoupa dados){
        roupaRepository.save(new Roupa (dados));
    }


    @GetMapping
    public List<Roupa> listarProdutos(){
        return roupaRepository.findAll();
    }

}
