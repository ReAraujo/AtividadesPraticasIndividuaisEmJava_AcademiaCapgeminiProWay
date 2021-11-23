/*_  Utilize o projeto construido ate a atividade ATP53 como base para este projeto.
  _  Altere os servlets de produto e categoria para que possam ler os parâmetros da requisição e 
      imprima os valores dos parâmetros na resposta.
  _  Para categoria, leia os parâmetros nome e descrição.
  _  Para produto, leia os parâmetros nome, valor e id_categoria.
  _  Utilize o método printf da classe PrintWriter para imprimir, na resposta, os parâmetros lidos.
*/

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria") // Endereço do qual o Servlet responde = "/categoria"
public class Categoria extends HttpServlet {
    // Protocolo HTTP/HTTPS: 
        // Request = Solicitação do usuário - Exemplo: o usuário acessando end. via Chrome 
        // Response = Resposta do servidor ao usuário - Exemplo: carregar a página web no Chrome
    
    @Override
        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nomeCat = req.getParameter("nome");
        String descricaoCat = req.getParameter("descricao");
           
        PrintWriter out = resp.getWriter();
        out.printf("Modulo Categoria");
        // Leitura e envio dos parâmetros nome e descrição por requisição pela url da página
        out.printf("\nInformacoes Categoria:\nNome: %s - Descricao: %s", nomeCat, descricaoCat);
    
    }
}
