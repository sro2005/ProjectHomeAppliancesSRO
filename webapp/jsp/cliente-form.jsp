<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clientes</title>
</head>
<body>
    <h1>Lista de Clientes</h1>
    <form action="cliente" method="post">
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
        <input type="text" id="telefono" name="telefono" required><br>
        
        <label for="preferenciasProductos">Preferencias de Productos:</label>
        <input type="text" id="preferenciasProductos" name="preferenciasProductos"><br>
        
        <button type="submit">Agregar Cliente</button>
    </form>

    <h2>Clientes Registrados</h2>
    <ul>
        <% 
            List<Cliente> clientes = (List<Cliente>) request.getAttribute("clientes");
            if (clientes != null) {
                for (Cliente cliente : clientes) {
        %>
                    <li><%= cliente.getNombres() %> <%= cliente.getApellidos() %></li>
        <% 
                }
            }
        %>
    </ul>
</body>
</html>
