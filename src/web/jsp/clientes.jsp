<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Clientes</title>
</head>
<body>
    <h1>Lista de Clientes</h1>
    <table border="1">
        <tr>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>Correo Electrónico</th>
            <th>Fecha de Nacimiento</th>
            <th>Dirección</th>
            <th>Teléfono</th>
            <th>Preferencias de Productos</th>
        </tr>
        <c:forEach var="cliente" items="${clientes}">
            <tr>
                <td>${cliente.nombres}</td>
                <td>${cliente.apellidos}</td>
                <td>${cliente.correoElectronico}</td>
                <td>${cliente.fechaNacimiento}</td>
                <td>${cliente.direccion}</td>
                <td>${cliente.telefono}</td>
                <td>${cliente.preferenciasProductos}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
