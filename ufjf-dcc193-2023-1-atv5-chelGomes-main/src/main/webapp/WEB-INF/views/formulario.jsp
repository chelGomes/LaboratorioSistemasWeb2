<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo02: formulario</title>
</head>
<body>
    <h1>Exemplo02: formulario</h1>
    <form action="resultado.html" method="post">
        <div>
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome"/>
        </div>
        <div>
            <label for="nome">Idade:</label>  
            <input type="number" id="idade" name="idade"/>
        </div>
        <div>
            <input type="submit">
            <input type="reset">
        </div>

    </form>
    
</body>
</html>
