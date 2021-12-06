package controller;

import java.util.ArrayList;

import model.Categoria;
import model.Produto;

public class CategoriaController extends BaseController<Categoria> {

    public void createProduto(Categoria categoria, Produto produto){
        categoria.produtos.add(produto);
        update(categoria);
    }

    public ArrayList<Produto> listaDeProdutos(Categoria categoria){
        return categoria.produtos;
    }

    public void atualizarListaProd(Categoria categoria, Produto produto){
        if(categoria.produtos.contains(produto)){
            deleteProduto(categoria, produto);
            createProduto(categoria, produto);
        }
    }

    public void deleteProduto(Categoria categoria, Produto produto){
        categoria.produtos.remove(produto);
        update(categoria);
    }
    
}
