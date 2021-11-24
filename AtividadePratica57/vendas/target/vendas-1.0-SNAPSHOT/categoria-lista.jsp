<%@ page import="java.util.ArrayList, com.aquariusdev.vendas.models.Categoria" %>

<%
    ArrayList<Categoria> categorias = (ArrayList<Categoria>)request.getAttribute("categorias"); 
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Categoria-Lista</title>
</head>
    <body>
        <h1>Lista - Categorias</h1>
        <form>

        </form>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NOME</th>
                    <th>DESCRIÇÃO</th>
                </tr>
            </thead>
            <tbody>
                <% for (Categoria model : categorias) { %>
                <tr>
                    <td><%= model.getId() %></td>
                    <td><%= model.getNome() %></td>
                    <td><%= model.getDescricao() %></td>
                </tr>
                <%}%>
            </tbody>
        </table>
    </body>
</html>