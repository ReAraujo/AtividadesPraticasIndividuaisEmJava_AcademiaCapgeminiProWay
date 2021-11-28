package model;

import java.util.Random;

public class Livro {
    // Encapsulamento: 
    private int id;
    private String titulo;
    private String autor;
    private String editora;
    private String categoria;

    // Métodos construtores de classe
    public Livro(String titulo, String autor, String editora, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
    }

    public Livro(int id, String titulo, String autor, String editora, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.categoria = categoria;
    }

    // Métodos setters (método de modificação) e getters (método de acesso)
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }

    // Método toString para impressão das informações
    public String toString() {
        return "\nInformações - Lista de Livros: " + 
                "| ID: " + this.getId() +  " " + 
                "| Título: " + this.getTitulo() + " " + 
                "| Autor: " + this.getAutor() + " " + 
                "| Editora: " + this.getEditora() + " " + 
                "| Categoria:  " + this.getEditora() + "|" +
                "\n"; 
    }
    
}
