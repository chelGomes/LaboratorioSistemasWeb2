<%@page pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de pessoas</title>
</head>
<body>
    <h1>Lista de pessoas</h1>
   <ol>
    <c:forEach var="pessoa" items="${pessoas}">
        <li>[${pessoa.id}] Nome: ${pessoa.nome} Idade: ${pessoa.idade}</li>
    </c:forEach>
   </ol>
    
</body>
</html>
