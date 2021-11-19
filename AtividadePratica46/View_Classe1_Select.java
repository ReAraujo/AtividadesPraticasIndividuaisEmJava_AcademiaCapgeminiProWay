/* _  Utilize as tabelas e os registros criados durante as atividades ATP41 e ATP42.
   _  Faça o download do driver JDBC para o postgres e configure no seu projeto.
   _  Crie uma conexão com o banco de dados postgresql utilizando JDBC(java.sql.*).
   _  Crie 4 classes para realizar as 4 operações de CRUD.
   _  Na classe1, liste todos os dados de todas as colunas da tabela produto.
   _  Na classe2, insira um novo produto na tabela e imprima o id gerado.
   _  Na classe3, altere todos os produtos para a mesma categoria e exiba a quantidade de linhas afetadas.
   _  Na classe4, delete um produto pelo id.
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
            String sql = "SELECT * from Categoria";

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
                String descricao = result.getString("descricao");
                System.out.printf("|ID: %d - |Nome: %s - |Descrição: %s \n", id, nome, descricao);            
            }

            // Fechando a conexão 
            conn.close();

        } catch (SQLException e) {
            System.out.println("Desculpe, não foi possível conectar.");
        }
    }
}