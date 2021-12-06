package model;

import java.util.ArrayList;

public class Categoria extends Base { // Herança
    public int id;
    public String nomeCat;
    public String descricaoCat;
    public ArrayList<Produto> produtos;

    // Método construtor da Classe:
    public Categoria() {
        this.produtos = new ArrayList<Produto>();
    }

    @Override
    public String toString() {
        String retorno = super.toString() + 
                        "| Nome Categoria: " + this.nomeCat + " " + 
                        "| Descrição: " + this.descricaoCat;
        return retorno;
    }

    
}
