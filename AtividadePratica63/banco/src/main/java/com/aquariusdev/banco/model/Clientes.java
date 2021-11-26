package com.aquariusdev.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Anotação @Entity (JPA): Informando ao Hibernate que essa Classe é uma entidade/tabela do DB:
@Entity 
// Anotação @Table (JPA): Informando que a tabela possui um nome diferente ("clientes"):
@Table(name = "clientes")
public class Clientes {
    @Id // Como o ID é auto gerado em primary key, é preciso adicionar essa anotação @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informando que a coluna ID é auto gerada - IDENTITY = incremento de um a um
    private int id;
    private String nomeCompleto;
    private int idade;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return this.idade;
    }
}
