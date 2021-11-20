package utils;
/* _  Crie uma cópia das classes criadas durante a atividade ATP48.
   _  Crie uma classe ConnectionFactory para abrigar sua fábrica de conexões. Esta classe deve ter um método que retorne uma Conexão com o Postgres.
  _  Altere as 4 classes para utilizarem a fábrica de conexões e tambem o try with resource para que a conexão seja fechada automaticamente.
*/

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    // A classe ConnectionFactory faz parte de um Padrão de Projeto e serve como estrutura para instanciar/fornecer
    // conexão a todas as classes que precisar utilizar -> Classe de Fábrica de Conexões 

    private DataSource dataSource; // Interface DataSource: Tenta estabelecer uma conexão com a fonte de dados que o objeto representa 

    public ConnectionFactory() {
        // Poll de Conexões: gerenciamento interno das conexões 
        ComboPooledDataSource poolConexoes = new ComboPooledDataSource();
        poolConexoes.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");
        poolConexoes.setUser("postgres");
        poolConexoes.setPassword("123789");
        poolConexoes.setMaxPoolSize(100);
        this.dataSource = poolConexoes; // poolConexoes é atribuído ao dataSource 
    }


    // Método que terá o retorno da conexão
    // Não terá sentido aplicar o Try/Catch no método 'getConnection()' pois a conexão será utilizada nas Classes 'View', por isso, usa-se o throws
    // O Try/Catch você utiliza quando já está tratando a exceção e o throw você utiliza quando quer passar o tratamento da exceção para outra classe
    public Connection getConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
}
