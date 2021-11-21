package model;

public class Categoria {
    private int id;
    private String nome;
    private String descricao;

    // Construtores da Classe:
    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Categoria(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Métodos Getters and Setters: 
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

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

    @Override
    public String toString() {
        String retorno = String.format("|ID: %d - |Nome: %s -|Descrição: %s\n", this.id, this.nome, this.descricao);
        return retorno;
    }
}
