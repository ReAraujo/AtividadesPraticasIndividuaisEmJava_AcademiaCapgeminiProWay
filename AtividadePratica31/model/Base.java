package model;

import java.util.Random;

public class Base {
    public int id;

    // Método construtor da Classe:
    public Base() {
        this.id = numeroID();
    }

    // Método que gera automaticamente o número identificador(id)
    private int numeroID(){
        Random id = new Random();
        return id.nextInt(500);
    }

    // Método subescrita equals (faz a comparação entre IDs):
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Base){
            Base outro = (Base)obj;
            if(this.id == outro.id){
                return true;
            }
        }        
        return false;
    }

    // Método sobescrita toString (para a impressão dos dados gerados):
    @Override
    public String toString() {
        String retorno = "| ID: " + this.id;
        return retorno;
    }
    
}
