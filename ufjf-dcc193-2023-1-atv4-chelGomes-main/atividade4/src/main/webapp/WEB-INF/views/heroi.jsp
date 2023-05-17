<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Atividade4: formulario_heroi</title>
</head>
<body>
    <h1>Atividade4: formulario_heroi</h1>
    <form action="supers.html" method="post">
        <div>
            <label for="nome">Nome:</label>
            <input type="text" id="nome" name="nome"/>
        </div>
        <div>
            <label for="superPoderes">SuperPoderes:</label>  
            <input type="text" id="superPoderes" name="superPoderes"/>
        </div>
        <div>
            <label for="identidade">Identidade:</label>  
            <input type="text" id="identidade" name="identidade"/>
        </div>
        <div>
            <input type="submit">
            <input type="reset">
        </div>

    </form>
    
</body>
</html>
