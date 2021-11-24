/*_  Utilize os projetos construídos nas atividades ATP52(JDBC) e ATP54(WEB) como base para este projeto.
  _  Ajuste o projeto para incluir as dependências do driver de conexão do postgres e a dependencia C3P0 para criação o pool de conexões.
  _  Altere a aplicação para construir uma camada DAO. Adicione na camada DAO, a classe de fábrica de conexões e a classe CategoriaDAO.
  _  Ajuste o model Categoria e Produto para possuírem um id. Adicione os metodos getter e setter.
  _  Ajuste o servlet de categoria para salvar uma categoria no banco utilizando a classe DAO. Retorne na resposta o ID gerado no banco.
  _  Crie um novo servlet para listar as categorias cadastradas.
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

        if (nome != null && nome != " ") {
            categorias = dao.read(nome);
        } else {
            categorias = dao.read();
        }

        req.setAttribute("categorias", categorias);

        RequestDispatcher reqDisp = req.getRequestDispatcher("/categoria-lista.jsp");
        // RequestDispatcher = encaminha uma requisição para ser atendida por outro recurso (forward)
        // No lado do server, a requisição do usuário será encaminhada para ser atendida por outro recurso (outro servlet),
        //  este outro servlet eventualmente devolverá outra página para o usuário.
        reqDisp.forward(req, resp); // .forward = Inclui o conteúdo de um recurso (servlet, página JSP, arquivo HTML) na resposta. 
    }
}
