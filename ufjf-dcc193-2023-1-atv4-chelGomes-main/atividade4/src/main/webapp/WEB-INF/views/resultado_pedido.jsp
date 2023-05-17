<%@page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pedido:</title>
</head>
<body>
    <h1>Pedido:</h1>
    <p>Bem vindo na Dragão Pizzaria!! Tamanho ${detalhe_pedido_pizza.tamanhoPizza}! Sabor da pizza ${detalhe_pedido_pizza.saborPizza}!</p>
    <p>Envie dados via <a href="detalhe_pedido.html">formulario</a></p>
    <form> Detalhe Pedido:
        <input type="hidden" name="tamanhoPizza" value="18">
        <input type="hidden" name="saborPizza" value="portuguesa">
        <input type="text" name="Pedido" size=16>
    </form>
    
</body>
</html>
