<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Productos</title>
</head>
<body>
    <h1>Lista de Productos</h1>
    <form action="producto" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br>
        
        <label for="descripcion">Descripción:</label>
        <input type="text" id="descripcion" name="descripcion" required><br>
        
        <label for="catalogoGeneral">Catálogo General:</label>
        <input type="text" id="catalogoGeneral" name="catalogoGeneral" required><br>
        
        <label for="precio">Precio:</label>
        <input type="number" id="precio" name="precio" required><br>
        
        <label for="cantidadDisponible">Cantidad Disponible:</label>
        <input type="number" id="cantidadDisponible" name="cantidadDisponible" required><br>
        
        <label for="imagenUrl">URL de la Imagen:</label>
        <input type="text" id="imagenUrl" name="imagenUrl"><br>
        
        <button type="submit">Agregar Producto</button>
    </form>

    <h2>Productos Registrados</h2>
    <ul>
        <% 
            List<Producto> productos = (List<Producto>) request.getAttribute("productos");
            if (productos != null) {
                for (Producto producto : productos) {
        %>
                    <li><%= producto.getNombre() %> - <%= producto.getPrecio() %></li>
        <% 
                }
            }
        %>
    </ul>
</body>
</html>
