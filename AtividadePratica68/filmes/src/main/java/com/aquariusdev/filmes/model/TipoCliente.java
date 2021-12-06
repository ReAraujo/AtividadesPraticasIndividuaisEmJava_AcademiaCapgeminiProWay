package com.aquariusdev.filmes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity // Informando que é uma entidade de tabela do DB
@Table(name = "tipocliente") // Informando que a tabela possui nome "tipocliente"
public class TipoCliente {
    // Encapsulamento:
    // Anotações @Getter @Setter = Métodos getters (métodos de acesso) e setters (métodos de modificação) inicializados pelo Lombok
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informando que a coluna 'id' é auto gerada no padrão 'Identity'
    @Getter @Setter
    private int id;

    @Getter @Setter
    private String tipoPessoa;
}
