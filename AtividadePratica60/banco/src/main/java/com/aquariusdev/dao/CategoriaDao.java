package com.aquariusdev.dao;

import java.util.List;

import com.aquariusdev.models.Categoria;

public class CategoriaDao {

    public int create(Categoria model){
        entMan.getTransaction().begin();  
        entMan.persist(model); 
        entMan.persist(model); 
    }
    public List<Categoria> read(){
        
    }   
    public void update(){

    }  
    public void delete(){

    }
}
