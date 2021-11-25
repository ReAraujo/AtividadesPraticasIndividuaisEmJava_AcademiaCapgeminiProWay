/*_  Utilize o projeto construído durante a atividades ATP57 como base para este projeto.
  _  Adicione a operação de delete, criando um link na página de listar. Crie os servlets e 
     jsps necessários para que a operação funcione.
  _  Adicione a operação de alterar, crie um link na página de listar, altere o dao para filtrar por id, 
     crie os dois servlets, um para carregar o dado em um form e o outro para salvar as alterações.
*/

package com.aquariusdev.vendas.servlets;

import java.io.IOException;
import java.util.ArrayList;

import com.aquariusdev.vendas.dao.CategoriaDao;
import com.aquariusdev.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/listar") // Endereço do qual o Servlet responde = "/categoria/listar"
public class CategoriaReadServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao();
        ArrayList<Categoria> categorias;
        String nome = req.getParameter("nome");

        if (nome != null && nome != "") {
            categorias = dao.read(nome);
        } else {
            categorias = dao.read();
        }

        req.setAttribute("categorias", categorias); // Enviando o atributo para a requisição em '/categoria-lista.jsp'

        RequestDispatcher reqDisp = req.getRequestDispatcher("/categoria-lista.jsp");
        // RequestDispatcher = encaminha uma requisição para ser atendida por outro recurso (forward)
        // No lado do server, a requisição do usuário será encaminhada para ser atendida por outro recurso (outro servlet),
        //  este outro servlet eventualmente devolverá outra página para o usuário.
        reqDisp.forward(req, resp); // .forward = Inclui o conteúdo de um recurso (servlet, página JSP, arquivo HTML) na resposta. 
    }
}
