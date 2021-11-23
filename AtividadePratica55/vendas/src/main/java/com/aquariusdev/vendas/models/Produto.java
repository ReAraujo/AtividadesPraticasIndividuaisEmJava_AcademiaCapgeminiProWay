package com.aquariusdev.vendas.models;

public class Produto {
    private String nome;
    private double valor;
    private int id;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return this.valor;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    
}
