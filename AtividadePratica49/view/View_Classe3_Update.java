package view;
/* _  Crie uma cópia das classes criadas durante a atividade ATP48.
   _  Crie uma classe ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter um método que retorne uma Conexão com o Postgres.
  _  Altere as 4 classes para utilizarem a fábrica de conexões e tambem o try with resource para que a conexão seja fechada automaticamente.
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class View_Classe3_Update {
   public static void main(String[] args) {
      // Conectando no Banco de Dados utilizando o método construtor 'ConnectionFactory()' na instância da classe 'Connection'
      // dentro de um Try with resource para um controle de abertura e fechamento de conexões 

      try(Connection conn = new ConnectionFactory().getConnection()) { 
         String sql = "UPDATE Categoria SET nome = ? where id = ?";   
         int id = 8;
         String nome = "Nome da Categoria a ser alterada";

         try (PreparedStatement prepStatement = conn.prepareStatement(sql)) {
            prepStatement.setInt(2, id);
            prepStatement.setString(1, nome);
   
            prepStatement.execute();
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
         } catch (Exception e) {
            e.printStackTrace();
         }

     } catch (SQLException e) {
         System.out.println("Desculpe, não foi possível conectar.");
     }
   }
}