<%-- 
    Document   : viewCliente
    Created on : 13-05-2019, 09:55:31 AM
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cotizacion del dia</h1>
        <div style="background: aqua; width: 500px; padding: 50px;">
        <h3>Guarda una Cotizacion</h3>
        
        <form action="ServletClientSetCotizacion"method="POST">
            <input type="text" name="fecha" placeholder="Fecha">
            <input type="text" name="valor" placeholder="Valor">
            <input type="submit" name="Guardar">
        </form>
        
        <br>
        <br>
        <h3> Buscar Cotizacion del dia</h3>
        <form action="ServletClientGetCotizacion"method="POST">
            <input type="text" name="fechaCotizacion" placeholder="Fecha de cotizacion">
            <input type="submit" name="Guardar">
        </form>
        </div>
    </body>
</html>
