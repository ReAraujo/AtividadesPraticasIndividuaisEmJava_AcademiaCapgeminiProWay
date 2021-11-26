/* _  Utilize como base o projeto criado durante a ATP59.
   _  Adicione uma camada dao ao projeto e crie nela uma classe CategoriaDao.
   _  Refatore o projeto para extrair a lógica de create e read da App e colocar na CategoriaDAO.
   _  Adicione os métodos de update e delete em CategoriaDao.
   _  Teste na App todos os metodos de crud da CategoriaDao.
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
