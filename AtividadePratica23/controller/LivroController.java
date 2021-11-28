package controller;

import java.util.ArrayList;

import model.Livro;

public class LivroController {
    // Encapsulamento do método array que guardará a lista dos livros
    private ArrayList<Livro> listaLivros = new ArrayList<Livro>();

    // Método para localizar um livro na lista pelo número de ID
    public Livro verify(int id){
        Livro livro2 = null;
        for (Livro livro : listaLivros) {
            if(livro.getId() == id){
                livro2 = livro;
            }
        }
        return livro2;
    }

    // CRUD
    // CREATE
    public void salvar(Livro l){
        listaLivros.add(l);
    }
    
    // READ
    public ArrayList<Livro> listar(){
        return listaLivros;
    }

    // UPDATE
    public void alterar(Livro l){
        for (Livro livro : listaLivros) {
            if(livro.getId() == l.getId()){
                deletar(livro);
                salvar(l);
            }
        }
    }

    // DELETE
    public void deletar(Livro l){
        listaLivros.remove(l);
    }
}