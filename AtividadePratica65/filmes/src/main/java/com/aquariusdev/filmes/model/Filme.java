package com.aquariusdev.filmes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Informando que é uma entidade de tabela do DB
@Table(name = "filme") // Informando que a tabela possui nome "filme"
public class Filme {

    // Encapsulamento:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informando que a coluna 'id' é auto gerada no padrão 'Identity'
    private int id;
    private String titulo;
    private String diretor;
    private String genero;

    // Métodos getters (métodos de acesso) e setters (métodos de modificação):
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getDiretor() {
        return this.diretor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return this.genero;
    }

}
