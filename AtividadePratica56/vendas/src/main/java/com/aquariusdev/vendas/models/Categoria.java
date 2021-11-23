package com.aquariusdev.vendas.models;

public class Categoria {
    private String nome;
    private String descricao;
    private int id;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
