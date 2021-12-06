package controller;

import java.util.ArrayList;

public abstract class BaseController<T> {
    private ArrayList<T> dados;

    // Método construtor da Classe:
    public BaseController() {
        this.dados = new ArrayList<T>();
    }

    // Métodos CRUD:
    // Create 
    public void create(T obj){
        this.dados.add(obj);
    }
    // Read
    public ArrayList<T> read(){
        return this.dados;
    }
    // Update 
    public void update(T obj){
        if(verificar(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }
    // Delete 
    public void delete(T obj){
        this.dados.remove(obj);
    }
        
    public boolean verificar(T obj){
        return this.dados.contains(obj);
    }
}
