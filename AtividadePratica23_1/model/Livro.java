package model;

import java.util.UUID;

public class Livro{
    private String titulo;
    private String autor;
    private String editora;
    private int numeroEdicao;
    private int anoLançamento;
    private UUID id;

    public Livro(int id){
        this.id = UUID.randomUUID();
    }
    public String getId() {
        return id.toString();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return this.autor;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return this.editora;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }
    public int getNumeroEdicao() {
        return this.numeroEdicao;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }
    public int getAnoLançamento() {
        return this.anoLançamento;
    }

    @Override
    public String toString() {
        return "\nID: " + this.getId() + 
            "\nTitulo: " + this.getTitulo() +
            "\nAutor(res): " + this.getAutor() +
            "\nEditora: " + this.getEditora() + 
            "\nNúmero edição: " + this.getNumeroEdicao() +
            "\nAno lançamento: " + this.getAnoLançamento();
    }





}
