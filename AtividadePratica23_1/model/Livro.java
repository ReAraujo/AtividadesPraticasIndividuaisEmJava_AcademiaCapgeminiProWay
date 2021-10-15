package model;

public class Livro{
    public String titulo;
    public String autor;
    public String editora;
    public int numeroEdicao;
    public int anoLançamento;
    private int id;

    public Livro(int id){
        this.id = id;
    }

    public int getId() {
        return this.id;
    }






}
