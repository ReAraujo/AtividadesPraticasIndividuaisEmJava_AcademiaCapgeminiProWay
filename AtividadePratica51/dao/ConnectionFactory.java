package dao;
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
    private DataSource dataSource; // Interface DataSource: Tenta estabelecer uma conexão com a fonte de dados que o objeto representa 

    public ConnectionFactory() {
        // Poll de Conexões: ocorre o gerenciamento interno das conexões 
        ComboPooledDataSource poolConexoes = new ComboPooledDataSource();
        poolConexoes.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        poolConexoes.setUser("postgres");
        poolConexoes.setPassword("123789");
        poolConexoes.setMaxPoolSize(50);
        this.dataSource = poolConexoes; // poolConexoes é atribuído ao dataSource 
    }

    // Método que terá o retorno da conexão
    // Não terá sentido aplicar o Try/Catch no método 'getConnection()' pois a conexão será utilizada nas Classes 'View', por isso, usa-se o throws
    // O Try/Catch você utiliza quando já está tratando a exceção e o throw você utiliza quando quer passar o tratamento da exceção para outra classe
    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
}
