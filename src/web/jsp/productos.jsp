<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Productos</title>
</head>
<body>
    <h1>Lista de Productos</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Descripción</th>
            <th>Catálogo General</th>
            <th>Precio</th>
            <th>Cantidad Disponible</th>
            <th>Imagen</th>
        </tr>
        <c:forEach var="producto" items="${productos}">
            <tr>
                <td>${producto.id}</td>
                <td>${producto.nombre}</td>
                <td>${producto.descripcion}</td>
                <td>${producto.catalogoGeneral}</td>
                <td>${producto.precio}</td>
                <td>${producto.cantidadDisponible}</td>
                <td><img src="${producto.imagenUrl}" alt="Imagen del Producto" width="100"></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
