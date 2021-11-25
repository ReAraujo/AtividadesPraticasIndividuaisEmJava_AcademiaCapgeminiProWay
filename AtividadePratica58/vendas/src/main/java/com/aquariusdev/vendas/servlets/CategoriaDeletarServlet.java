package com.aquariusdev.vendas.servlets;

import java.io.IOException;

import com.aquariusdev.vendas.dao.CategoriaDao;
import com.aquariusdev.vendas.models.Categoria;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/categoria/deletar") // Rota do qual o Servlet responde = "/categoria/deletar"
public class CategoriaDeletarServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CategoriaDao dao = new CategoriaDao(); // Objeto da CategoriaDao
        Categoria model = new Categoria(); // Objeto da Categoria via Model

        int id = Integer.parseInt(req.getParameter("id")); // Pegando o parâmetro 'ID' recebido da requisição 
        // É necessária a conversão para tipo 'inteiro' pois pela rota é enviado em formato Object

        model.setId(id);;
        dao.delete(model); // Utilizando o método 'delete' via CategoriaDao para deletar a Categoria informada via parâmetro 'ID' recebido  

        RequestDispatcher reqDisp = req.getRequestDispatcher("/categoria/listar");
        // RequestDispatcher = encaminha uma requisição para ser atendida por outro recurso (forward)
        reqDisp.forward(req, resp);
    }
}