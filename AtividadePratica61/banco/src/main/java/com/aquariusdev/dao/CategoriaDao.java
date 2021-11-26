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

import com.aquariusdev.models.Categoria;

public class CategoriaDao {
    private EntityManager entityManager;

    public CategoriaDao() {
        this.entityManager = new ConnectionFactory().getConnection();
    }

    // CRUD:
    public int create(Categoria model){
        // fazendo o controle local da conexão = abertura/start de conexão:
        this.entityManager.getTransaction().begin();  
        // .persist() = Persistindo a entidade 'model' - seria somente preciso esse passo se o controle estivesse pelo Tomcat:
        this.entityManager.persist(model); 
        // fazendo o controle local da conexão = fechamento da conexão:
        this.entityManager.getTransaction().commit(); 
        return model.getId();
    }
    public List<Categoria> read(){
        return this.entityManager.createQuery("SELECT c FROM Categoria c ORDER BY id", Categoria.class).getResultList(); 
        // .createQuery() = Criando uma listagem
        // .getResultList() = receber os resultados transformados já no formato lista
    }   
    public void update(Categoria model){
        this.entityManager.getTransaction().begin();  
        this.entityManager.merge(model); 
        // .merge = Remove the entity instance - irá buscar uma linha na tabela que tenha o mesmo ID
        // que está sendo passado e alterar somente e apenas o que foi foi alterado
        this.entityManager.getTransaction().commit(); 
    }  
    public void delete(int id){
        // Documentação .remove = Find by primary key. Search for an entity of the specified class and primary key.
        // If the entity instance is contained in the persistence context, it is returned from there.
        // é necessário receber uma entidade nesse método pois o método .remove
        // espera uma entidade (algo que ele já sabe que existe no DB)
        Categoria model = this.entityManager.find(Categoria.class, id); // Busca no DB pelo ID, se tiver, é criada uma instância (Categoria model)
        // .find = método que busca uma única linha na tabela pelo ID e retorna a instância se ele achou
        // caso o .find não localizar nenhum ID, o retorno será nulo (null)
        if(model != null){
            this.entityManager.getTransaction().begin();  
            this.entityManager.remove(model); // E então é enviado para ser deletado
            this.entityManager.getTransaction().commit(); 
        }else{
            System.out.println("Desculpe, não foi realizar a operação de deletar.\n");
        }
    }
}
