package com.aquariusdev.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Anotação @Entity (JPA): Informando ao Hibernate que essa Classe é uma entidade/tabela do DB:
@Entity
// Anotação @Table (JPA): Informando que a tabela possui um nome diferente ("agencia"):
@Table(name = "agencia")
public class Agencia {
    @Id // Como o ID é auto gerado em primary key, é preciso adicionar essa anotação @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informando que a coluna ID é auto gerada - IDENTITY = incremento de um a um
    private int id;
    private String agencia;
    private String numeroCC;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getAgencia() {
        return this.agencia;
    }

    public void setNumeroCC(String numeroCC) {
        this.numeroCC = numeroCC;
    }
    public String getNumeroCC() {
        return this.numeroCC;
    }   
}
