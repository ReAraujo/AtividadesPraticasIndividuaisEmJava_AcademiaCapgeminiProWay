package view;
/* _  Crie uma cópia das classes criadas durante a atividade ATP50.
   _  Altere aplicação para separar a camada de acesso ao banco da camada de visualização.
   _  Crie uma camada DAO e nela uma classe CategoriaDAO que irá realizar as operações de CRUD no banco com JDBC.
   _  Ajuste as classes de view para utilizarem a classe CategoriaDAO;
*/

import java.sql.Connection;
import java.sql.SQLException;
import dao.CategoriaDao;
import dao.ConnectionFactory;

import model.Categoria;

public class View_Insert {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {   
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria categoria1 = new Categoria(16, "Nova Categoria 1", "Nova descrição de Categoria 1"); // Informando o ID, nome e a descrição da nova Categoria a ser criada 

            dao.create(categoria1);

        } catch (SQLException e) {
            System.out.println("Desculpe, não foi possível conectar.");
        }
    }
}
