package view;
/* _  Crie uma cópia das classes criadas durante a atividade ATP49.
   _  Faça o download das bibliotecas para criação do pool:C3P0 e mchange
   _  Altere a fábrica de conexões para utilizarem um pool de conexões com um limite de 50 conexões.
   _  Altere o método que retorna a conexão para retornar uma conexão vinda de um DataSource;
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class View_Classe4_Delete {
   public static void main(String[] args) {
      // Conectando no Banco de Dados utilizando o método construtor 'ConnectionFactory()' na instância da classe 'Connection'
      // dentro de um Try with resource para um controle de abertura e fechamento de conexões      

      try (Connection conn = new ConnectionFactory().getConnection()) { 
         int idDeletar = 9;
         String sql = "DELETE FROM Categoria WHERE id = ? ";

         try (PreparedStatement prepStatement = conn.prepareStatement(sql)) {
            prepStatement.setInt(1, idDeletar);
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
