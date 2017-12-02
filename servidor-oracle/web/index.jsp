<%-- 
    Document   : index
    Created on : 25-nov-2017, 9:31:54
    Author     : T-102
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <meta name="viewport"  content="width=device-width, initial-scale">
    </head>
    <body>
        <h1>Proyecto de base de datos 2</h1>
        <form action="autenticar.php" method="post">
            <input type="text" name="login" placeholder="tu usuario">
            <input type="password" name="password" placeholder="tu password">
            <input type="submit" value="autenticarse">
        </form>
    </body>
</html>
