package dao;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Categoria;

// Padrão de Projeto Dao = Data Access Object - será a classe que fará o acesso ao Banco de Dados 
// Em resumo, DAO é um padrão de projetos onde um objeto:
//  provê uma interface que abstrai o acesso a dados;
//  lê e grava a partir da origem de dados (banco de dados, arquivo, memória, etc.);
//  encapsula o acesso aos dados, de forma que as demais classes não precisam saber sobre isso.
public class CategoriaDao {
    private Connection conn;

    public CategoriaDao(Connection conn) {
        this.conn = conn;
    }

    // CRUD
    // CREATE:
    public void create(Categoria model) throws SQLException {    
        String sql = "INSERT INTO Categoria (nome, descricao) values (?, ?)";
        PreparedStatement prepStatement = this.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        prepStatement.setString(1, model.getNome());  
        prepStatement.setString(2, model.getDescricao());   
        prepStatement.execute();
        ResultSet retornoIDs = prepStatement.getGeneratedKeys();
    
        while (retornoIDs.next()) { 
            int id = retornoIDs.getInt(1);
            System.out.println(id);
        }
    }
    // READ:
    public ArrayList<Categoria> read() throws SQLException {
        ArrayList<Categoria> lista = new ArrayList<Categoria>();
        
        String sql = "SELECT * FROM Categoria";
        PreparedStatement prepStatement = conn.prepareStatement(sql);
        prepStatement.execute();
        ResultSet result = prepStatement.getResultSet();
                
        while (result.next()) { 
            Categoria categoria1 = new Categoria(result.getInt("id"), result.getString("nome"), result.getString("descricao"));
            lista.add(categoria1); // Retorna uma lista de Categorias         
        }  
        return lista;
    }
    // UPDATE: 
    public int update(Categoria model) throws SQLException {
        String sql = "UPDATE Categoria SET nome = ? where id = ?";   
        PreparedStatement prepStatement = conn.prepareStatement(sql);
        prepStatement.setString(1, model.getNome());
        prepStatement.setInt(2, model.getId());
        prepStatement.execute();

        return prepStatement.getUpdateCount();
    }
    // DELETE: 
    public int delete(int id) throws SQLException {            
        int linhasAfetadas = 0;
        
        String sql = "DELETE FROM Categoria WHERE id = ? ";
        PreparedStatement prepStatement = conn.prepareStatement(sql);
        prepStatement.setInt(1, id);
        prepStatement.execute();
               
        linhasAfetadas = prepStatement.getUpdateCount();
        System.out.println(linhasAfetadas);

        return linhasAfetadas;
    }
}    




