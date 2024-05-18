package inventario;

import util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {
    // Método para obtener todos los productos del inventario
    public List<Producto> obtenerTodosProductos() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        
        try (
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery()
        ) {
            while (resultSet.next()) {
                Producto producto = new Producto(
                    resultSet.getInt("id"),
                    resultSet.getString("nombre"),
                    resultSet.getString("descripcion"),
                    resultSet.getString("catalogo_general"),
                    resultSet.getDouble("precio"),
                    resultSet.getInt("cantidad_disponible"),
                    resultSet.getString("imagen_url")
                );
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productos;
    }

    // Método para agregar un nuevo producto al inventario
    public void agregarProducto(Producto producto) {
        String sql = "INSERT INTO productos (nombre, descripcion, catalogo_general, precio, cantidad_disponible, imagen_url) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, producto.getNombre());
            preparedStatement.setString(2, producto.getDescripcion());
            preparedStatement.setString(3, producto.getCatalogoGeneral());
            preparedStatement.setDouble(4, producto.getPrecio());
            preparedStatement.setInt(5, producto.getCantidadDisponible());
            preparedStatement.setString(6, producto.getImagenUrl());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Otros métodos para actualizar y eliminar productos según sea necesario
}
