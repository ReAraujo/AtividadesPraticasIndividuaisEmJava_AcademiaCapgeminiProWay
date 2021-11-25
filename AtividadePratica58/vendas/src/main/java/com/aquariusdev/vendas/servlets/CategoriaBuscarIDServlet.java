/*_  Utilize o projeto construído durante a atividades ATP57 como base para este projeto.
  _  Adicione a operação de delete, criando um link na página de listar. Crie os servlets e 
     jsps necessários para que a operação funcione.
  _  Adicione a operação de alterar, crie um link na página de listar, altere o dao para filtrar por id, 
     crie os dois servlets, um para carregar o dado em um form e o outro para salvar as alterações.
*/

package com.aquariusdev.vendas.servlets;

import java.io.IOException;

import com.aquariusdev.vendas.dao.CategoriaDao;
import com.aquariusdev.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/carregar") // Rota do qual o Servlet responde = "/categoria/carregar"
public class CategoriaBuscarIDServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao(); // Objeto da CategoriaDao
        int id = Integer.parseInt(req.getParameter("id")); // Pegando o parâmetro 'ID' recebido da requisição 
        // É necessária a conversão para tipo 'inteiro' pois pela rota é enviado em formato Object

        Categoria model = dao.readByID(id);
        // Utilizando o método 'readBy ID = ler por ID' via CategoriaDao para localizar um ID e retornar com a Categoria pertencente a esse ID

        RequestDispatcher reqDis = req.getRequestDispatcher("/categoria-alterar.jsp");
        // RequestDispatcher = encaminha uma requisição para ser atendida por outro recurso (forward)
        req.setAttribute("model", model); // Enviando o model para ser utilizado como atributo no arquivo jsp
        reqDis.forward(req, resp);
    }
}
