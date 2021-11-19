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

public class View_Classe1_Select {
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
            String sql = "SELECT id, nome FROM Categoria";

            // Conectando no Banco de Dados
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);

            // Statement = Executes the given SQL statement (comando SQL)
            Statement statement = conn.createStatement();
            statement.execute(sql);

            // Result = Retorno da consulta
            ResultSet result = statement.getResultSet();

            // Imprimindo o resultado de Result (retorno)
            while (result.next()) { 
                int id = result.getInt("id");
                String nome = result.getString("nome");
                System.out.printf("|ID: %d - |Nome: %s \n", id, nome);            
            }

            // Fechando a conexão 
            conn.close();

        } catch (SQLException e) {
            System.out.println("Desculpe, não foi possível conectar.");
        }
    }
}