package com.example.desafio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Produto {
  
  @Id
  @GeneratedValue
  private long id;
  @Column
  private String nome;
  @Column
  private String descricao;
  @Column
  private double valor;
}
