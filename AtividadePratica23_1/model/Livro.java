package model;

public class Livro{
    private String titulo;
    private String autor;
    private String editora;
    private int numeroEdicao;
    private int anoLançamento;
    private int id;

    public Livro(int id){
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






}
