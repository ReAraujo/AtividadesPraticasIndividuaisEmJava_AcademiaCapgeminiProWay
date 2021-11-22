/* _  Utilize o projeto construido ate a atividade ATP54 como base para este projeto.
   _  Altere a aplicação para possuir duas camadas: Model e Servlets. Altere o nome dos servlets para CategoriaServet e ProdutoServlet. 
       Arraste ambos os servlets para a camada servlet.
   _  Dentro da camada Model, crie um model para categoria e outro para produto. 
       Utilize o conceito de encapsulamento (atributos privados e GETTERS e SETTERS)
   _  Utilize nos servlets as classes de modelo, carregando os objetos com os parâmetros da requisição e retornando na resposta os atributos do objeto criado.
   _  Na pasta webapp, adicione mais dois arquivos .JSP. Um para categoria e outro para produto. 
       Nos arquivos de possuir um formulário HTML com os campos que representam cada Model e enviando os dados para cada servlet correspondente.
   _  Ajuste os links do index.jsp para chamar os novos jsps e não os servlets diretamente como antes.
*/

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto")
public class Produto extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        String nomeProd = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String parametroID = req.getParameter("id_categoria");
        
        out.println("Modulo Produto");

        if(parametroID != null && parametroID != null){
            int id_categoria = Integer.parseInt(parametroID);
            double valorProd = Double.parseDouble(parametroValor);
            out.printf("\nInformacoes Produto:\nNome: %s - ID: %d - Valor: %.2f", nomeProd, id_categoria, valorProd);
        } else{
            out.printf("\nInformacoes Produto: Nome: %s", nomeProd);
        }
    }
    
}
