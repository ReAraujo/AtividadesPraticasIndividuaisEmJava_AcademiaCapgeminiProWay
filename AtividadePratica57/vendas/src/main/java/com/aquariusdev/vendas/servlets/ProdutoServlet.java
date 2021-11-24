/*_  Utilize o projeto construído durante a atividades ATP56 como base para este projeto.
  _  Altere o retorno do servlet que salva uma categoria, para que ao inves de retornar a resposta, redirecione a resposta para um arquivo jsp.
  _  Ajuste o projeto para que a lista de categorias seja impressa dentro de um JSP. Para isso encaminhe a requisição para um novo arquivo jsp e nele carregue a lista via scriptlet.
  _  Adicione ao arquivo jsp de listagem de categorias um formulário para filtrar as categorias por nome ou descrição. Altere o DAO para realizar o filtro.
  _  Adicione uma pasta css e crie um estilo padrão para todas as páginas jsp.
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

@WebServlet(urlPatterns = "/produto") // Endereço do qual o Servlet responde = "/produto"
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
