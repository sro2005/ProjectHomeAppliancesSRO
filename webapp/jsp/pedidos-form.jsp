<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pedidos</title>
</head>
<body>
    <h1>Lista de Pedidos</h1>
    <form action="pedido" method="post">
        <label for="nombreCliente">Nombre del Cliente:</label>
        <input type="text" id="nombreCliente" name="nombreCliente" required><br>
        
        <label for="apellidosCliente">Apellidos del Cliente:</label>
        <input type="text" id="apellidosCliente" name="apellidosCliente" required><br>
        
        <label for="correoElectronico">Correo Electrónico:</label>
        <input type="email" id="correoElectronico" name="correoElectronico" required><br>
        
        <label for="telefono">Teléfono:</label>
        <input type="text" id="telefono" name="telefono" required><br>
        
        <label for="direccionEnvio">Dirección de Envío:</label>
        <input type="text" id="direccionEnvio" name="direccionEnvio" required><br>
        
        <label for="metodoPago">Método de Pago:</label>
        <input type="text" id="metodoPago" name="metodoPago" required><br>
        
        <label for="fechaEntrega">Fecha de Entrega:</label>
        <input type="date" id="fechaEntrega" name="fechaEntrega" required><br>
        
        <label for="listaProductos">Lista de Productos:</label>
        <textarea id="listaProductos" name="listaProductos" required></textarea><br>
        
        <label for="montoTotal">Monto Total:</label>
        <input type="number" id="montoTotal" name="montoTotal" required><br>
        
        <button type="submit">Agregar Pedido</button>
    </form>

    <h2>Pedidos Registrados</h2>
    <ul>
        <% 
            List<Pedido> pedidos = (List<Pedido>) request.getAttribute("pedidos");
            if (pedidos != null) {
                for (Pedido pedido : pedidos) {
        %>
                    <li><%= pedido.getNombreCliente() %> <%= pedido.getApellidosCliente() %> - <%= pedido.getMontoTotal() %></li>
        <% 
                }
            }
        %>
    </ul>
</body>
</html>
