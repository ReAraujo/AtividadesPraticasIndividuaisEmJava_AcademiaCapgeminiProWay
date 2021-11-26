package com.aquariusdev.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
    private EntityManager entityManager;

    public ConnectionFactory() {
        // Criando a Fábrica de Conexões via chave "banco":
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco"); 
        // Criando a conexão com o DB:
        this.entityManager = factory.createEntityManager(); 
    }

    public EntityManager getConnection(){
        return entityManager;
    }
}
