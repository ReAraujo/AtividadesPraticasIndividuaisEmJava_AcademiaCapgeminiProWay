/* _  Utilize como base o projeto criado durante a ATP59.
   _  Adicione uma camada dao ao projeto e crie nela uma classe CategoriaDao.
   _  Refatore o projeto para extrair a lógica de create e read da App e colocar na CategoriaDAO.
   _  Adicione os métodos de update e delete em CategoriaDao.
   _  Teste na App todos os metodos de crud da CategoriaDao.
*/

package com.aquariusdev;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.aquariusdev.models.Categoria;

public class App {
    public static void main( String[] args ){
        // Criando objeto da Classe Categoria via models:
        Categoria model = new Categoria(); 
        model.setNome("Teste 3 JPA - Nome");
        model.setDescricao("Teste 3 JPA - Descricao");

        // Criando a Fábrica de Conexões via chave "banco":
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco"); 
        // Criando a conexão com o DB:
        EntityManager entMan = factory.createEntityManager(); 
        
        List<Categoria> lista = entMan.createQuery("SELECT c FROM Categoria c ORDER BY id", Categoria.class).getResultList(); 
        // .createQuery() = Criando uma listagem - deve ser adicionado o nome da Classe como se fosse o nome da tabela (classe: Categoria.java):
        // .getResultList() = receber os resultados transformados já em formato lista

        // como o controle será local, conforme adicionado no arquivo persistence.xml (transaction-type="RESOURCE_LOCAL") 
        // será necessário entãoé necessário abrir uma conexão (.getTransaction().begin()) e fazer o commit dela (.getTransaction().commit()):
        // fazendo o controle local da conexão = abertura/start de conexão:
        entMan.getTransaction().begin();  
        // .persist() = Persistindo a entidade 'model' - seria somente preciso esse passo se o controle estivesse pelo Tomcat:
        entMan.persist(model); 
        // fazendo o controle local da conexão = fechamento da conexão:
        entMan.persist(model); 
        
        for (Categoria categoria : lista) {
            System.out.printf("ID: %d | Nome: %s | Descrição: %s \n",categoria.getId(), categoria.getNome(), categoria.getDescricao()); 
        }

    }
}
