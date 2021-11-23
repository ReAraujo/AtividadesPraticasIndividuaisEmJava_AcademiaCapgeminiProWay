package com.aquariusdev.vendas.dao;
/* _  Crie uma cópia das classes criadas durante a atividade ATP50.
   _  Altere aplicação para separar a camada de acesso ao banco da camada de visualização.
   _  Crie uma camada DAO e nela uma classe CategoriaDAO que irá realizar as operações de CRUD no banco com JDBC.
   _  Ajuste as classes de view para utilizarem a classe CategoriaDAO;
*/

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private DataSource dataSource;  

    public ConnectionFactory() {
        ComboPooledDataSource poolConexoes = new ComboPooledDataSource();
        poolConexoes.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        poolConexoes.setUser("postgres");
        poolConexoes.setPassword("123789");
        poolConexoes.setMaxPoolSize(50);
        this.dataSource = poolConexoes; // poolConexoes é atribuído ao dataSource 
    }

    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
}
