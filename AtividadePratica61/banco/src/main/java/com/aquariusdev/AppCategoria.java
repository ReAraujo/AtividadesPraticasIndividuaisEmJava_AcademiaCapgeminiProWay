/* _  Utilize como base o projeto criado durante a ATP60.
   _  Adicione na camada dao uma classe Factory para abstrair a criacao do EntityManager.
   _  Altere o persistence.xml para refletir as alterações das entidades .
       <property name="hibernate.hbm2ddl.auto" value="update"/> 
   _  Crie uma nova classe de modelo para mapear uma nova tabela no banco de dados.
   _  Crie uma classe dao para o novo modelo.
   _  Teste as operações de crud para este novo modelo.
*/

package com.aquariusdev;

import com.aquariusdev.dao.CategoriaDao;
import com.aquariusdev.models.Categoria;

public class AppCategoria {
    public static void main( String[] args ){
        // Criando objeto da Classe Categoria via models:
        Categoria model = new Categoria(); 
        model.setId(39);
        model.setNome("Teste 8 JPA - Nome");
        model.setDescricao("Teste 8 JPA - Descricao");

        // Criando objeto da Classe CategoriaDao:
        CategoriaDao dao = new CategoriaDao();

        dao.create(model); // Método Create do CRUD
        dao.update(model); // Método Update do CRUD
        dao.delete(38); // Método Delete do CRUD

        // Método Read do CRUD:
        for (Categoria categoria : dao.read()) {
            System.out.printf("ID: %d | Nome: %s | Descrição: %s \n",categoria.getId(), categoria.getNome(), categoria.getDescricao()); 
        }
    }
}
