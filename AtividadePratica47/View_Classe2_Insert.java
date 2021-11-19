/* _  Utilize as tabelas e os registros criados durante as atividades ATP41 e ATP42.
   _  Crie uma conexão com o banco de dados postgresql utilizando JDBC(java.sql.*).
   _  Crie 4 classes para realizar as 4 operações de CRUD.
   _  Na classe1, liste id e nome de todas as linhas da tabela Categoria.
   _  Na classe2, insira uma nova Categoria e imprima o id gerado.
   _  Na classe3, altere o nome da primeira e segunda categoria da tabela e exiba a quantidade de linhas afetadas.
   _  Na classe4, delete as ultimas categorias cadastradas.
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
