<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista de Pedidos</title>
</head>
<body>
    <h1>Lista de Pedidos</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nombre del Cliente</th>
            <th>Apellidos del Cliente</th>
            <th>Correo Electrónico</th>
            <th>Teléfono</th>
            <th>Dirección de Envío</th>
            <th>Método de Pago</th>
            <th>Fecha de Entrega</th>
            <th>Lista de Productos</th>
            <th>Monto Total</th>
        </tr>
        <c:forEach var="pedido" items="${pedidos}">
            <tr>
                <td>${pedido.id}</td>
                <td>${pedido.nombreCliente}</td>
                <td>${pedido.apellidosCliente}</td>
                <td>${pedido.correoElectronico}</td>
                <td>${pedido.telefono}</td>
                <td>${pedido.direccionEnvio}</td>
                <td>${pedido.metodoPago}</td>
                <td>${pedido.fechaEntrega}</td>
                <td>${pedido.listaProductos}</td>
                <td>${pedido.montoTotal}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
