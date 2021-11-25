<%
    int id = (int)request.getAttribute("id"); 
%>

<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Sucesso</title>
        <link rel="stylesheet" href="css/styles.css">     
    </head>
    <body>
        <h2>Operacao realizada com sucesso!</h2>
        <h4>Categoria - ID: <%= id %> - Cadastrada com sucesso!</h4><br />
        <a href="/vendas-1/categoria.jsp">Cadastar Nova Categoria</a><br />
    </body>
</html>