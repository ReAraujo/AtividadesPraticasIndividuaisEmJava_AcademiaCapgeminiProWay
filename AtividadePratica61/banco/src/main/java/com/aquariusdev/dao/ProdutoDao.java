/* _  Utilize como base o projeto criado durante a ATP60.
   _  Adicione na camada dao uma classe Factory para abstrair a criacao do EntityManager.
   _  Altere o persistence.xml para refletir as alterações das entidades .
       <property name="hibernate.hbm2ddl.auto" value="update"/> 
   _  Crie uma nova classe de modelo para mapear uma nova tabela no banco de dados.
   _  Crie uma classe dao para o novo modelo.
   _  Teste as operações de crud para este novo modelo.
*/

package com.aquariusdev.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.aquariusdev.models.Produto;

public class ProdutoDao {
    private EntityManager entManager;

    public ProdutoDao() {
        // Criando a Fábrica de Conexões via chave "banco":
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco"); 
        // Criando a conexão com o DB:
        this.entManager = factory.createEntityManager(); 
    }

    // CRUD:
    public int create(Produto model){
        // fazendo o controle local da conexão = abertura/start de conexão:
        this.entManager.getTransaction().begin();  
        // .persist() = Persistindo a entidade 'model' - seria somente preciso esse passo se o controle estivesse pelo Tomcat:
        this.entManager.persist(model); 
        // fazendo o controle local da conexão = fechamento da conexão:
        this.entManager.getTransaction().commit(); 
        return model.getId();
    }
    public List<Produto> read(){
        return this.entManager.createQuery("SELECT p FROM Produto p ORDER BY id", Produto.class).getResultList(); 
        // .createQuery() = Criando uma listagem
        // .getResultList() = receber os resultados transformados já no formato lista
    }   
    public void update(Produto model){
        this.entManager.getTransaction().begin();  
        this.entManager.merge(model); 
        // .merge = Remove the entity instance - irá buscar uma linha na tabela que tenha o mesmo ID
        // que está sendo passado e alterar somente e apenas o que foi foi alterado
        this.entManager.getTransaction().commit(); 
    }  
    public void delete(int id){
        // Documentação .remove = Find by primary key. Search for an entity of the specified class and primary key.
        // If the entity instance is contained in the persistence context, it is returned from there.
        // é necessário receber uma entidade nesse método pois o método .remove
        // espera uma entidade (algo que ele já sabe que existe no DB)
        Produto model = this.entManager.find(Produto.class, id); // Busca no DB pelo ID, se tiver, é criada uma instância (Produto model)
        // .find = método que busca uma única linha na tabela pelo ID e retorna a instância se ele achou
        // caso o .find não localizar nenhum ID, o retorno será nulo (null)
        if(model != null){
            this.entManager.getTransaction().begin();  
            this.entManager.remove(model); // E então é enviado para ser deletado
            this.entManager.getTransaction().commit(); 
        }else{
            System.out.println("Desculpe, não foi realizar a operação de deletar.\n");
        }
    }
}
