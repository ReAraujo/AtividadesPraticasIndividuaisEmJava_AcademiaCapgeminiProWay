package view;
/* _  Crie uma cópia das classes criadas durante a atividade ATP49.
   _  Faça o download das bibliotecas para criação do pool:C3P0 e mchange
   _  Altere a fábrica de conexões para utilizarem um pool de conexões com um limite de 50 conexões.
   _  Altere o método que retorna a conexão para retornar uma conexão vinda de um DataSource;
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
