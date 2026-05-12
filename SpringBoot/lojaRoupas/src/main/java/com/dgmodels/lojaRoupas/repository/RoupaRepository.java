package com.dgmodels.lojaRoupas.repository;

import com.dgmodels.lojaRoupas.model.Roupa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoupaRepository extends JpaRepository<Roupa, Long> {

    List<Roupa> findByNomeProduto(String nomeProduto);
}
