<!DOCTYPE html>
<html>
<head>
    <title>Agregar Producto</title>
</head>
<body>
    <h2>FORMULARIO - AGREGAR PRODUCTO</h2>
    <form action="${pageContext.request.contextPath}/producto" method="post">
        <label for="nombre">Nombre del Producto:</label>
        <input type="text" id="nombre" name="nombre"><br>
        
        <label for="descripcion">Descripción:</label>
        <input type="text" id="descripcion" name="descripcion"><br>
        
        <label for="catalogoGeneral">Catálogo General:</label>
        <input type="text" id="catalogoGeneral" name="catalogoGeneral"><br>
        
        <label for="precio">Precio:</label>
        <input type="number" id="precio" name="precio" step="0.01"><br>
        
        <label for="cantidadDisponible">Cantidad Disponible:</label>
        <input type="number" id="cantidadDisponible" name="cantidadDisponible"><br>
        
        <label for="imagenUrl">URL de la Imagen:</label>
        <input type="text" id="imagenUrl" name="imagenUrl"><br>
        
        <input type="submit" value="Agregar Producto">
    </form>
</body>
</html>
