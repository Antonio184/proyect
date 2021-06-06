<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    </head>
    <body>

        <div class="container " align="center">
            <div class="row vh-100 justify-content-center  align-items-center">
                <div class="col-lg-4  " align="center">
                    <h1>Registro de Persona</h1>
                    <form action="recibir.do" method="POST">
                        <div class="input-group mb-3">
                            <span class="input-group-text" id="inputGroup-sizing-default">DUI</span>
                            <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="txtDui" value="" required /> <br>
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text" id="inputGroup-sizing-default">Apellidos</span>
                            <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="txtApellidos" value="" required /> <br>
                        </div>
                        <div class="input-group mb-3">
                            <span class="input-group-text" id="inputGroup-sizing-default">Nombres</span>
                            <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" name="txtNombres" value="" required/> <br>
                        </div>



                        <input type="submit" value="Registrar nueva persona" class="btn btn-outline-success" /><br>
                    </form>
                </div>
                <div class="container" align="center"> 
                    <a href="mostrar.do" class="btn btn-primary">Listado de los Registros</a> 
                    <a href="" class="btn btn-danger">Eliminar un Registro</a> 
                </div>
            </div>

        </div> 

    </body>
</html>
