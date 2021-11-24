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
