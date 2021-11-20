/* _  Crie uma cópia das classes criadas durante a atividade ATP48.
   _  Crie uma classe ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter um método que retorne uma Conexão com o Postgres.
  _  Altere as 4 classes para utilizarem a fábrica de conexões e tambem o try with resource para que a conexão seja fechada automaticamente.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
            
            // Conectando no Banco de Dados
            Connection conn = DriverManager.getConnection(connectionString, user, pwd);
            
            // Query SQL
            PreparedStatement prepStatement = conn.prepareStatement("INSERT INTO Categoria (nome, descricao) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            
            // Recebendo os parâmetros 'nome' e 'descrição' através de variáveis
            String nome = "Nome da Categoria";
            String descricao = "Descrição da Categoria";
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);
            // Utilizar o PreparedStatement faz com que o que valor que foi adicionado nas variáveis 'nome' e 'descricao' seja lido em formato String 
            // e não em formato comando SQL utilizado dentro do Banco de dados, impedindo assim, um possível ataque ao Banco de Dados. Exemplo:
            // -> String possivelAtaque = "Hardware');delete from categoria; INSERT INTO categoria(nome) values('otario";
            // -> prepStatement.setString(1, possivelAtaque);          

            // Executando
            prepStatement.execute();

            // Retorno da consulta - Retorna o conjunto de IDs que foram gerados
            ResultSet retornoIDs = prepStatement.getGeneratedKeys();

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
