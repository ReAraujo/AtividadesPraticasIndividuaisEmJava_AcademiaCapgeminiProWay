package model;

public class Livro extends Base {
    private String titulo;
    private String autor;
    private String editora;
    private String categoria;

    public Livro(int id){
        super(id);
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




    
}
