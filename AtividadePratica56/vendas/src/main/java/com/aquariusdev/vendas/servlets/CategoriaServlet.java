package com.aquariusdev.vendas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

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
      Categoria cat1 = new Categoria(); // Criação do objeto da classe Categoria de Models

      cat1.setNome(req.getParameter("nome"));
      cat1.setDescricao(req.getParameter("descricao"));
            
      PrintWriter out = resp.getWriter();
      out.printf("Modulo Categoria");
      out.printf("\nInformacoes da Categoria:\nNome: %s - Descricao: %s", cat1.getNome(), cat1.getDescricao());
   }

}
