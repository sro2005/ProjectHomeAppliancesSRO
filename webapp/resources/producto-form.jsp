<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de Producto</title>
</head>
<body>
    <h2>Formulario de Producto</h2>
    <form action="ProductoServlet" method="post">
        <label for="nombre">Nombre del Producto:</label>
        <input type="text" id="nombre" name="nombre" required><br>

        <label for="descripcion">Descripción:</label>
        <input type="text" id="descripcion" name="descripcion" required><br>

        <label for="catalogoGeneral">Catálogo General:</label>
        <input type="text" id="catalogoGeneral" name="catalogoGeneral" required><br>

        <label for="precio">Precio:</label>
        <input type="number" id="precio" name="precio" step="0.01" min="0" required><br>

        <label for="cantidadDisponible">Cantidad Disponible:</label>
        <input type="number" id="cantidadDisponible" name="cantidadDisponible" min="0" required><br>

        <label for="imagenUrl">URL de la Imagen:</label>
        <input type="text" id="imagenUrl" name="imagenUrl"><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>
