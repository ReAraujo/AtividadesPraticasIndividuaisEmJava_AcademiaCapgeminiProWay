package com.aquariusdev.vendas.dao;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private DataSource dataSource;  

    public ConnectionFactory() {
        ComboPooledDataSource poolConexoes = new ComboPooledDataSource();
        try {
            poolConexoes.setDriverClass("org.postgresql.Driver");
        } catch (PropertyVetoException ex) {
            ex.printStackTrace();
        }
        poolConexoes.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        poolConexoes.setUser("postgres");
        poolConexoes.setPassword("123789");
        poolConexoes.setMaxPoolSize(50);
        this.dataSource = poolConexoes; 
    }

    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
}
