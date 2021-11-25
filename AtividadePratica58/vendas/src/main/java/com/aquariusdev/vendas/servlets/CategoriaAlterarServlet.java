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

@WebServlet(urlPatterns = "/categoria/alterar") // Rota do qual o Servlet responde = "/categoria/alterar"
public class CategoriaAlterarServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id")); // Pegando o parâmetro 'ID' recebido da requisição 
        // É necessária a conversão para tipo 'inteiro' pois pela rota é enviado em formato Object

        String nome = req.getParameter("nome");

        Categoria model = new Categoria();
        model.setId(id);
        model.setNome(nome);

        CategoriaDao dao = new CategoriaDao();
        dao.update(model);

        RequestDispatcher reqDisp = req.getRequestDispatcher("/categoria-alterado-sucesso.jsp");
        req.setAttribute("id", model.getId());
        reqDisp.forward(req, resp);
    }
}
