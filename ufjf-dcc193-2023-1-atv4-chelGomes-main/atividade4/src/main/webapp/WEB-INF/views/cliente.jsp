<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Atividade4: formulario_cliente</title>
</head>
<body>
    <h1>Atividade4: formulario_cliente</h1>
    <form action="cliente.html" method="post">
        <div>
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome"/>
        </div>
        <div>
            <label for="numeroTelefone">Numero Telefone:</label>  
            <input type="text" id="numeroTelefone" name="numeroTelefone"/>
        </div>
        <div>
            <label for="endereco">Endereco:</label>  
            <input type="text" id="endereco" name="endereco"/>
        </div>
        <div>
            <input type="submit">
            <input type="reset">
        </div>
    </form>    
</body>
</html>