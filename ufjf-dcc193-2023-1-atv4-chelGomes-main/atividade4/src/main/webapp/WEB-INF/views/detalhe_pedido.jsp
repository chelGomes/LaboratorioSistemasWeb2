<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Atividade4: formulario_detalhePedido</title>
</head>
<body>
    <h1>Atividade4: formulario_detalhePedido</h1>
    <form action="sabores.html" method="post">
        <div>
            <label for="tamanhoPizza">Tamanho Pizza:</label>
            <input type="text" id="tamanhoPizza" name="tamanhoPizza"/>
        </div>
       <div>
        <input type="radio" id="portuguesa" name="sabores" value="Portuguesa">
        <label for="portuguesa">Portuguesa</label><br>
        <input type="radio" id="marguerita" name="sabores" value="Marguerita">
        <label for="marguerita">Marguerita</label><br>
        <input type="radio" id="quatro_queijos" name="sabores" value="Quatro Queijos">
        <label for="quatro_queijos">Quatro Queijos</label>
        <input type="radio" id="calabresa" name="sabores" value="Calabresa">
        <label for="calabresa">Calabresa</label>
        <input type="radio" id="pepperoni" name="sabores" value="Pepperoni">
        <label for="pepperoni">Pepperoni</label>
       </div>
    </form>   
</body>
</html>