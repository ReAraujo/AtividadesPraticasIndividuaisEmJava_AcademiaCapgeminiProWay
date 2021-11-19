/* _  Crie uma cópia das classes criadas durante a atividade ATP47.
   _  Altere a classe1 para utilizar preparedStatement.
   _  Altere a classe2 para receber os parâmetros nome e descrição através de variáveis e troque o Statement para PreparedStatement.
   _  Altere a classe3 para  receber os nomes das categorias que serão alteradas, através de variáveis e troque o Statement para PreparedStatement.
   _  Altere a classe4 para receber o Id da categorias a ser deletada através de variável e troque o Statement para PreparedStatement..
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View_Classe2_Insert {
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
            String sql = "INSERT INTO Categoria (nome, descricao) values ('Brindes', 'Brindes a serem enviados junto com o produto adquirido')";

            // Conectando no Banco de Dados
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);

            // Statement = Executes the given SQL statement (comando SQL)
            Statement statement = conn.createStatement();
            statement.execute(sql, Statement.RETURN_GENERATED_KEYS);

            // Retorno da consulta - Retorna o conjunto de IDs que foram gerados
            ResultSet retornoIDs = statement.getGeneratedKeys();

            // Imprimindo o resultado de Result (retorno)
            while (retornoIDs.next()) { 
                int id = retornoIDs.getInt(1);
                System.out.println(id);
            }

            // Fechando a conexão 
            conn.close();

        } catch (SQLException e) {
            System.out.println("Desculpe, não foi possível conectar.");
        }
    }
    
}
