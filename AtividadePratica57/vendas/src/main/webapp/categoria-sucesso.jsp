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
</head>
    <body>
        <h2>Operação realizada com sucesso!</h2>
        <h4>Categoria - ID: <%= id %> - Cadastrada com sucesso!</h4><br />
    </body>
</html>