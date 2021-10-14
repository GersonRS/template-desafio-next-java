package com.example.desafio.repository;

import com.example.desafio.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
  
}
