<!DOCTYPE html>
<html>
<head>
    <title>Agregar Cliente</title>
</head>
<body>
    <h2>FORMULARIO - AGREGAR CLIENTE</h2>
    <form action="${pageContext.request.contextPath}/cliente" method="post">
        <label for="nombres">Nombres:</label>
        <input type="text" id="nombres" name="nombres"><br>
        
        <label for="apellidos">Apellidos:</label>
        <input type="text" id="apellidos" name="apellidos"><br>
        
        <label for="correoElectronico">Correo Electrónico:</label>
        <input type="email" id="correoElectronico" name="correoElectronico"><br>
        
        <label for="fechaNacimiento">Fecha de Nacimiento:</label>
        <input type="date" id="fechaNacimiento" name="fechaNacimiento"><br>
        
        <label for="direccion">Dirección:</label>
        <input type="text" id="direccion" name="direccion"><br>
        
        <label for="telefono">Teléfono:</label>
        <input type="text" id="telefono" name="telefono"><br>
        
        <label for="preferenciasProductos">Preferencias de Productos:</label>
        <input type="text" id="preferenciasProductos" name="preferenciasProductos"><br>
        
        <input type="submit" value="Agregar Cliente">
    </form>
</body>
</html>
