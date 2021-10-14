package com.example.desafio.controller;

import java.util.List;

import com.example.desafio.model.Produto;
import com.example.desafio.repository.ProdutoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoControlle{
  
  private ProdutoRepository produtoRepository;

  @GetMapping("/produtos")
  public List<Produto> listarProdutos() {
    return produtoRepository.findAll();
  }
}
