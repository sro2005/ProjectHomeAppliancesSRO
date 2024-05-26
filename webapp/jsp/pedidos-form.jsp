<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Formulario de Pedido</title>
</head>
<body>
    <h2>Formulario de Pedido</h2>
    <form action="PedidoServlet" method="post">
        <label for="nombreCliente">Nombre del Cliente:</label>
        <input type="text" id="nombreCliente" name="nombreCliente" required><br>
        
        <label for="apellidosCliente">Apellidos del Cliente:</label>
        <input type="text" id="apellidosCliente" name="apellidosCliente" required><br>
        
        <label for="correoElectronico">Correo Electrónico:</label>
        <input type="email" id="correoElectronico" name="correoElectronico" required><br>
        
        <label for="telefono">Teléfono:</label>
        <input type="tel" id="telefono" name="telefono" required><br>
        
        <label for="direccionEnvio">Dirección de Envío:</label>
        <input type="text" id="direccionEnvio" name="direccionEnvio" required><br>
        
        <label for="metodoPago">Método de Pago:</label>
        <select id="metodoPago" name="metodoPago">
            <option value="Efectivo">Efectivo</option>
            <option value="Tarjeta">Tarjeta</option>
        </select><br>
        
        <label for="fechaEntrega">Fecha de Entrega:</label>
        <input type="date" id="fechaEntrega" name="fechaEntrega" required><br>
        
        <label for="listaProductos">Lista de Productos:</label>
        <textarea id="listaProductos" name="listaProductos"></textarea><br>
        
        <label for="montoTotal">Monto Total:</label>
        <input type="number" id="montoTotal" name="montoTotal" step="0.01" min="0" required><br>
        
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
