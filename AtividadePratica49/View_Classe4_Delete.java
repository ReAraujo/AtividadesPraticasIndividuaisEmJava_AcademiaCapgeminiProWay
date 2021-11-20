/* _  Crie uma cópia das classes criadas durante a atividade ATP48.
   _  Crie uma classe ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter um método que retorne uma Conexão com o Postgres.
  _  Altere as 4 classes para utilizarem a fábrica de conexões e tambem o try with resource para que a conexão seja fechada automaticamente.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View_Classe4_Delete {
   public static void main(String[] args) {
      try {
         String driverType = "jdbc";
         String driverName = "postgresql";
         String host = "localhost";
         int port = 5432;
         String database = "postgres";
         String user = "postgres";
         String pwd = "123789";
         String connectionString = String.format("%s:%s://%s:%d/%s", driverType, driverName, host, port, database);

         // Conectando no Banco de Dados
         Connection conn = DriverManager.getConnection(connectionString, user, pwd);

         // Query SQL
         PreparedStatement prepStatement = conn.prepareStatement("DELETE FROM Categoria WHERE id = ? ");

         // ID a ser deletado + comando para setar esse valor de ID informado
         int idDeletar = 6;
         prepStatement.setInt(1, idDeletar);

         // Executar
         prepStatement.execute();

         // Verificando quantas linhas foram afetadas pelo método DELETE
         int linhasAfetadas = prepStatement.getUpdateCount();
         System.out.println(linhasAfetadas);

         // Fechando a conexão 
         conn.close();

     } catch (SQLException e) {
         System.out.println("Desculpe, não foi possível conectar.");
     }
   }
}   
