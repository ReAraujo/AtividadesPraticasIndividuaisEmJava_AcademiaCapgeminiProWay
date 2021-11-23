package com.aquariusdev.vendas.servlets;
/*_  Utilize o projeto construido ate a atividade ATP54 como base para este projeto.
  _  Altere a aplicação para possuir duas camadas: Model e Servlets. 
     Altere o nome dos servlets para CategoriaServet e ProdutoServlet. Arraste ambos os servlets para a camada servlet.
  _  Dentro da camada Model, crie um model para categoria e outro para produto. 
     Utilize o conceito de encapsulamento (atributos privados e GETTERS e SETTERS)
  _  Utilize nos servlets as classes de modelo, carregando os objetos com os parâmetros da requisição e 
     retornando na resposta os atributos do objeto criado.
  _  Na pasta webapp, adicione mais dois arquivos .JSP. Um para categoria e outro para produto. 
     Nos arquivos de possuir um formulário HTML com os campos que representam cada Model e enviando os dados para cada servlet correspondente.
  _  Ajuste os links do index.jsp para chamar os novos jsps e não os servlets diretamente como antes.
*/

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
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      Categoria cat1 = new Categoria(); // Criação do objeto da classe Categoria de Models

      cat1.setNome(req.getParameter("nome"));
      cat1.setDescricao(req.getParameter("descricao"));
            
      PrintWriter out = resp.getWriter();
      out.printf("Modulo Categoria");
      out.printf("\nInformacoes da Categoria:\nNome: %s - Descricao: %s", cat1.getNome(), cat1.getDescricao());
   }

}
