/* _  Utilize como base o projeto criado durante a ATP60.
   _  Adicione na camada dao uma classe Factory para abstrair a criacao do EntityManager.
   _  Altere o persistence.xml para refletir as alterações das entidades .
       <property name="hibernate.hbm2ddl.auto" value="update"/> 
   _  Crie uma nova classe de modelo para mapear uma nova tabela no banco de dados.
   _  Crie uma classe dao para o novo modelo.
   _  Teste as operações de crud para este novo modelo.
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
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informando que a coluna ID é auto gerada - IDENTITY = incremento de um a um
    private int id;
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
