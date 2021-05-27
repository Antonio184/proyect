<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Persona</h1>
        
        <form action="recibir.do" method="POST">
            DUI:<input type="text" name="txtDui" value="" />
            Apellidos<input type="text" name="txtApellidos" value="" />
            Nombres<input type="text" name="txtNombres" value="" />
            <input type="submit" value="Registrar nueva persona"/>
            
        </form>
    </body>
</html>
