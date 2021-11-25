package com.aquariusdev;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.aquariusdev.models.Categoria;

public class App {
    public static void main( String[] args ){
        Categoria model = new Categoria(); // Criando objeto da Classe Categoria via models 
        model.setNome("Teste 3 JPA - Nome");
        model.setDescricao("Teste 3 JPA - Descricao");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco"); // Criando a Fábrica de Conexões via chave "banco"
        EntityManager entMan = factory.createEntityManager(); // Criando a conexão com o DB
        
        List<Categoria> lista = entMan.createQuery("SELECT c FROM Categoria c ORDER BY id", Categoria.class).getResultList(); 
        // .createQuery() = Criando uma listagem - deve ser adicionado o nome da Classe como se fosse o nome da tabela (classe: Categoria.java):
        // .getResultList() = receber os resultados transformados já em formato lista

        // como o controle será local, conforme adicionado no arquivo persistence.xml (transaction-type="RESOURCE_LOCAL") 
        // então é necessário abrir uma conexão (.getTransaction().begin()) e fazer o commit dela (.getTransaction().commit()):
        entMan.getTransaction().begin(); // fazendo o controle local da conexão = abertura/start de conexão 
        entMan.persist(model); 
        // .persist() = Persistindo a entidade 'model' - seria somente preciso esse passo se o controle estivesse pelo Tomcat
        entMan.getTransaction().commit(); // fazendo o controle local da conexão = fechamento da conexão 
        
        for (Categoria categoria : lista) {
            System.out.printf("ID: %d | Nome: %s | Descrição: %s \n",categoria.getId(), categoria.getNome(), categoria.getDescricao()); 
        }

    }
}
