/* _  Utilize como base o projeto criado durante a ATP60.
   _  Adicione na camada dao uma classe Factory para abstrair a criacao do EntityManager.
   _  Altere o persistence.xml para refletir as alterações das entidades .
       <property name="hibernate.hbm2ddl.auto" value="update"/> 
   _  Crie uma nova classe de modelo para mapear uma nova tabela no banco de dados.
   _  Crie uma classe dao para o novo modelo.
   _  Teste as operações de crud para este novo modelo.
*/

package com.aquariusdev;

import com.aquariusdev.dao.ProdutoDao;
import com.aquariusdev.models.Produto;

public class AppProduto {
    public static void main( String[] args ){
        // Criando objeto da Classe Produto via models:
        Produto model = new Produto(); 
        model.setId(39);
        model.setNome("Teste 8 JPA - Nome");
        model.setDescricao("Teste 8 JPA - Descricao");
        model.setPreco(48.75);
        model.setId_categoria(1); // Chave Estrangeira (Foreign Key) da tabela Categoria 

        // Criando objeto da Classe ProdutoDao:
        ProdutoDao dao = new ProdutoDao();

        dao.create(model); // Método Create do CRUD
        dao.update(model); // Método Update do CRUD
        dao.delete(41); // Método Delete do CRUD

        // Método Read do CRUD:
        for (Produto produto : dao.read()) {
            System.out.printf("ID: %d | Nome: %s | Descrição: %s | Valor: R$ %.2f \n", 
            produto.getId(), produto.getNome(), produto.getDescricao(), produto.getPreco()); 
        }
    }
}
