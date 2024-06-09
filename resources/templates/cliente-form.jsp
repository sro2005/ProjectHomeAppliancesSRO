<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de Cliente</title>
</head>
<body>
    <h2>Formulario de Cliente</h2>
    <form action="ClienteServlet" method="post">
        <label for="nombres">Nombres:</label>
        <input type="text" id="nombres" name="nombres" required><br>
        
        <label for="apellidos">Apellidos:</label>
        <input type="text" id="apellidos" name="apellidos" required><br>
        
        <label for="correoElectronico">Correo Electrónico:</label>
        <input type="email" id="correoElectronico" name="correoElectronico" required><br>
        
        <label for="fechaNacimiento">Fecha de Nacimiento:</label>
        <input type="date" id="fechaNacimiento" name="fechaNacimiento" required><br>
        
        <label for="direccion">Dirección:</label>
        <input type="text" id="direccion" name="direccion" required><br>
        
        <label for="telefono">Teléfono:</label>
        <input type="tel" id="telefono" name="telefono" required><br>
        
        <label for="preferenciasProductos">Preferencias de Productos:</label>
        <textarea id="preferenciasProductos" name="preferenciasProductos"></textarea><br>
        
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
