<!DOCTYPE html>
<html>
<head>
    <title>Agregar Pedido</title>
</head>
<body>
    <h2>FORMULARIO - AGREGAR PEDIDO</h2>
    <form action="${pageContext.request.contextPath}/pedido" method="post">
        <label for="nombreCliente">Nombre del Cliente:</label>
        <input type="text" id="nombreCliente" name="nombreCliente"><br>
        
        <label for="apellidosCliente">Apellidos del Cliente:</label>
        <input type="text" id="apellidosCliente" name="apellidosCliente"><br>
        
        <label for="correoElectronico">Correo Electrónico:</label>
        <input type="email" id="correoElectronico" name="correoElectronico"><br>
        
        <label for="telefono">Teléfono:</label>
        <input type="text" id="telefono" name="telefono"><br>
        
        <label for="direccionEnvio">Dirección de Envío:</label>
        <input type="text" id="direccionEnvio" name="direccionEnvio"><br>
        
        <label for="metodoPago">Método de Pago:</label>
        <input type="text" id="metodoPago" name="metodoPago"><br>
        
        <label for="fechaEntrega">Fecha de Entrega:</label>
        <input type="date" id="fechaEntrega" name="fechaEntrega"><br>
        
        <label for="listaProductos">Lista de Productos:</label>
        <textarea id="listaProductos" name="listaProductos"></textarea><br>
        
        <label for="montoTotal">Monto Total:</label>
        <input type="number" id="montoTotal" name="montoTotal" step="0.01"><br>
        
        <input type="submit" value="Agregar Pedido">
    </form>
</body>
</html>

