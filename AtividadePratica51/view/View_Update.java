package view;
/* _  Crie uma cópia das classes criadas durante a atividade ATP50.
   _  Altere aplicação para separar a camada de acesso ao banco da camada de visualização.
   _  Crie uma camada DAO e nela uma classe CategoriaDAO que irá realizar as operações de CRUD no banco com JDBC.
   _  Ajuste as classes de view para utilizarem a classe CategoriaDAO;
*/

import java.sql.Connection;

import dao.CategoriaDao;
import dao.ConnectionFactory;
import model.Categoria;

public class View_Update {
   public static void main(String[] args) {
      try(Connection conn = new ConnectionFactory().getConnection()) { 
         CategoriaDao dao = new CategoriaDao(conn);
         Categoria model = new Categoria(15, "Novo nome de Categoria - Update"); // Informando o ID a ser alterado e o novo nome da Categoria que será modificado
         System.out.println(dao.update(model));
            
      } catch (Exception e) {
         System.out.println("Desculpe, não foi possível conectar.");
      }

   }
}