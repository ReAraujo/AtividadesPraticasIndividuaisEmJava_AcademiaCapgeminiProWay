/*_  Utilize os projetos construídos nas atividades ATP52(JDBC) e ATP54(WEB) como base para este projeto.
  _  Ajuste o projeto para incluir as dependências do driver de conexão do postgres e a dependencia C3P0 para criação o pool de conexões.
  _  Altere a aplicação para construir uma camada DAO. Adicione na camada DAO, a classe de fábrica de conexões e a classe CategoriaDAO.
  _  Ajuste o model Categoria e Produto para possuírem um id. Adicione os metodos getter e setter.
  _  Ajuste o servlet de categoria para salvar uma categoria no banco utilizando a classe DAO. Retorne na resposta o ID gerado no banco.
  _  Crie um novo servlet para listar as categorias cadastradas.
*/

package com.aquariusdev.vendas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.aquariusdev.vendas.dao.CategoriaDao;
import com.aquariusdev.vendas.models.Categoria;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria") // Endereço do qual o Servlet responde = "/categoria"
public class CategoriaServlet extends HttpServlet {
    // Protocolo HTTP/HTTPS: 
        // Request = Solicitação do usuário - Exemplo: o usuário acessando end. via Chrome 
        // Response = Resposta do servidor ao usuário - Exemplo: carregar a página web no Chrome
    
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      CategoriaDao dao = new CategoriaDao();
      Categoria model = new Categoria(); 

      model.setNome(req.getParameter("nome"));
      model.setDescricao(req.getParameter("descricao"));
      int id = dao.insert(model);

      model.setId(id);
            
      PrintWriter out = resp.getWriter();
      out.printf("Modulo Categoria");
      out.printf("\nA Categoria foi salva com sucesso! ID gerado: %d", model.getId());
   }

}
