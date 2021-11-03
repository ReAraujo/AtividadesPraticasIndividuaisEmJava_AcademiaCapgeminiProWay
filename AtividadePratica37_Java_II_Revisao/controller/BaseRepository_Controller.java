package controller;

import java.util.ArrayList;
import model.Prato;

public abstract class BaseRepository_Controller<P> extends Prato {
    private ArrayList<P> pratos;

    public BaseRepository_Controller() {
        this.pratos =  new ArrayList<P>();
    }

    public int tamanhoLista(){
        return this.pratos.size();
    }
    
    public boolean verificar(P obj){
        return this.pratos.contains(obj);
    }

    // CRUD:
    // Create 
    public void create(P obj){
        this.pratos.add(obj);
    }
    // Read
    public ArrayList<P> read(){
        return this.pratos;
    }
    // Update 
    public void update(P obj){
        if(verificar(obj)){
            this.delete(obj);
            this.create(obj);
        }
    }
    // Delete 
    public void delete(P obj){
        this.pratos.remove(obj);
    }



}
