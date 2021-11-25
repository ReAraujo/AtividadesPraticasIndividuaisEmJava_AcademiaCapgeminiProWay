/*_  Utilize o projeto construído durante a atividades ATP57 como base para este projeto.
  _  Adicione a operação de delete, criando um link na página de listar. Crie os servlets e 
     jsps necessários para que a operação funcione.
  _  Adicione a operação de alterar, crie um link na página de listar, altere o dao para filtrar por id, 
     crie os dois servlets, um para carregar o dado em um form e o outro para salvar as alterações.
*/

package com.aquariusdev.vendas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import com.aquariusdev.vendas.models.Produto;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/produto") // Rota do qual o Servlet responde = "/produto"
public class ProdutoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Produto prod1 = new Produto(); 
    
        String nomeProd = req.getParameter("nome");
        String parametroValor = req.getParameter("valor");
        String parametroID = req.getParameter("id_categoria");

        prod1.setNome(nomeProd);
            
        out.println("Modulo Produto");
    
        if(parametroID != null && parametroValor != null){
            prod1.setId(Integer.parseInt(parametroID));
            prod1.setValor(Double.parseDouble(parametroValor));
            out.printf("\nInformacoes do Produto:\nNome: %s - ID: %d - Valor: %.2f", prod1.getNome(), prod1.getId(), prod1.getValor());
        } else{
            out.printf("\nInformacoes do Produto: Nome: %s", prod1.getNome());
        }
    }
        
}    
