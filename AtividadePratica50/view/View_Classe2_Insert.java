package view;
/* _  Crie uma cópia das classes criadas durante a atividade ATP48.
   _  Crie uma classe ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter um método que retorne uma Conexão com o Postgres.
  _  Altere as 4 classes para utilizarem a fábrica de conexões e tambem o try with resource para que a conexão seja fechada automaticamente.
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ConnectionFactory;

public class View_Classe2_Insert {
    public static void main(String[] args) {
        // Conectando no Banco de Dados utilizando o método construtor 'ConnectionFactory()' na instância da classe 'Connection'
        // dentro de um Try with resource para um controle de abertura e fechamento de conexões

        try(Connection conn = new ConnectionFactory().getConnection()) {           
            String sql = "INSERT INTO Categoria (nome, descricao) values (?, ?)";
            String nome = "Nome da Categoria 2";
            String descricao = "Descrição da Categoria 2";

            try (PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                prepStatement.setString(1, nome);
                prepStatement.setString(2, descricao);         
    
                prepStatement.execute();
                
                ResultSet retornoIDs = prepStatement.getGeneratedKeys();
    
                while (retornoIDs.next()) { 
                    int id = retornoIDs.getInt(1);
                    System.out.println(id);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("Desculpe, não foi possível conectar.");
        }
    }
}
