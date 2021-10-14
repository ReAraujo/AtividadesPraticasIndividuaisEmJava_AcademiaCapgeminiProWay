package controller;

import java.util.ArrayList;

import model.Livro;

public class LivroController {
    private ArrayList<Livro> listaLivros = new ArrayList<Livro>();

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