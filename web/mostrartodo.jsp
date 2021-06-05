<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Todos los Registros!</h1>
    <c:forEach var="listaTotal" items="${sessionScope.persona}">
        DUI:${listaTtotal.dui}<br>
        APELLIDO:${listaTtotal.apellidos}<br>
        NOMBRE:${listaTtotal.nombres}<br>
    
    </c:forEach>
    </body>
</html>
