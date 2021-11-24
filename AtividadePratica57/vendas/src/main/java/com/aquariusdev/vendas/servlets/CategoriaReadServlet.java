/*_  Utilize o projeto construído durante a atividades ATP56 como base para este projeto.
  _  Altere o retorno do servlet que salva uma categoria, para que ao inves de retornar a resposta, redirecione a resposta para um arquivo jsp.
  _  Ajuste o projeto para que a lista de categorias seja impressa dentro de um JSP. Para isso encaminhe a requisição para um novo arquivo jsp e nele carregue a lista via scriptlet.
  _  Adicione ao arquivo jsp de listagem de categorias um formulário para filtrar as categorias por nome ou descrição. Altere o DAO para realizar o filtro.
  _  Adicione uma pasta css e crie um estilo padrão para todas as páginas jsp.
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

        req.setAttribute("categorias", categorias);

        RequestDispatcher reqDisp = req.getRequestDispatcher("/categoria-lista.jsp");
        // RequestDispatcher = encaminha uma requisição para ser atendida por outro recurso (forward)
        // No lado do server, a requisição do usuário será encaminhada para ser atendida por outro recurso (outro servlet),
        //  este outro servlet eventualmente devolverá outra página para o usuário.
        reqDisp.forward(req, resp); // .forward = Inclui o conteúdo de um recurso (servlet, página JSP, arquivo HTML) na resposta. 
    }
}
