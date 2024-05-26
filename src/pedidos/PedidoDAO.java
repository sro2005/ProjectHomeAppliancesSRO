package pedidos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utilidades.DBUtil;

public class PedidoDAO {
    public void agregarPedido(Pedido pedido) {
        String sql = "INSERT INTO pedidos (nombre_cliente, apellidos_cliente, correo_electronico, telefono, direccion_envio, metodo_pago, fecha_entrega, lista_productos, monto_total) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, pedido.getNombreCliente());
            preparedStatement.setString(2, pedido.getApellidosCliente());
            preparedStatement.setString(3, pedido.getCorreoElectronico());
            preparedStatement.setString(4, pedido.getTelefono());
            preparedStatement.setString(5, pedido.getDireccionEnvio());
            preparedStatement.setString(6, pedido.getMetodoPago());
            preparedStatement.setString(7, pedido.getFechaEntrega());
            preparedStatement.setString(8, pedido.getListaProductos());
            preparedStatement.setDouble(9, pedido.getMontoTotal());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al agregar pedido a la base de datos", e);
            // Lanzar una excepción personalizada
        }
    }

    // Otros métodos para actualizar y eliminar pedidos según sea necesario
}
