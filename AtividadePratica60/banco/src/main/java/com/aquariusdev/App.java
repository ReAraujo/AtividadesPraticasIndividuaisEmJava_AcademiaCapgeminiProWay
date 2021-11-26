/* _  Utilize como base o projeto criado durante a ATP59.
   _  Adicione uma camada dao ao projeto e crie nela uma classe CategoriaDao.
   _  Refatore o projeto para extrair a lógica de create e read da App e colocar na CategoriaDAO.
   _  Adicione os métodos de update e delete em CategoriaDao.
   _  Teste na App todos os metodos de crud da CategoriaDao.
*/

package com.aquariusdev;

import com.aquariusdev.dao.CategoriaDao;
import com.aquariusdev.models.Categoria;

public class App {
    public static void main( String[] args ){
        // Criando objeto da Classe Categoria via models:
        Categoria model = new Categoria(); 
        model.setId(39);
        model.setNome("Teste 8 JPA - Nome");
        model.setDescricao("Teste 8 JPA - Descricao");

        // Criando objeto da Classe CategoriaDao:
        CategoriaDao dao = new CategoriaDao();

        dao.create(model); // Método Create do CRUD
        dao.update(model); // Método Update do CRUD
        dao.delete(41); // Método Delete do CRUD

        // Método Read do CRUD:
        for (Categoria categoria : dao.read()) {
            System.out.printf("ID: %d | Nome: %s | Descrição: %s \n",categoria.getId(), categoria.getNome(), categoria.getDescricao()); 
        }
    }
}
