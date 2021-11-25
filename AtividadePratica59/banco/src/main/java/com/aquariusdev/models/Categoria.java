/* _  Crie um novo projeto maven utilizando o archetype maven-archetype-quickstart.
   _  Adicione as dependencias do hibernate e do postgresql ao POM.XML.
   _  Altere a versão do java na parte de build- plugins.
   _  Crie o arquivo persistence.xml dentro da pasta src/main/resources/META-INF.
   _  Adicione as informações do seu banco de dados no arquivo de persistencia.
   _  Crie uma model categoria e mapeie com a tabela categoria do seu banco de dados, através do hibernate.
   _  Teste no App.java um insert e um listar todos.
*/

package com.aquariusdev.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Mapeamento @Entity + @Table: 
@Entity // Anotação @Entity: Informando ao Hibernate que essa Classe é uma entidade/tabela do DB
@Table(name = "categoria") // Anotação @Table: Informando que a tabela possui um nome diferente
public class Categoria {
    @Id // Como o ID é auto gerado em primary key, é preciso adicionar essa anotação @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informando que a coluna ID é auto gerada - IDENTITY = incremento de um a um - No Oracle, usa-se o SEQUENCE
    private int id;
    // @Column (name = "nome_categoria") -> Pode ser adicionada a anotação @Column para dizer que essa refere-se ao nome de uma coluna que está no DB
    private String nome;
    private String descricao;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
}
