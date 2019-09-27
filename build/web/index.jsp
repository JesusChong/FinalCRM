<%-- 
    Document   : index FROM BIBLIOTECA
    Created on : 26/09/2019, 01:37:21 AM
    Author     : Lenovo Y50-70
--%>


<!--DIRECTIVAS-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!--apenas se abra el index, que muestre el listalibros.jsp-->
        <jsp:forward page = "listarLibros.jsp"></jsp:forward>
    </body>
</html>
