package cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.DBUtil;

public class ClienteDAO {
    public void agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nombres, apellidos, correo_electronico, fecha_nacimiento, direccion, telefono, preferencias_productos) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (
            Connection connection = DBUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, cliente.getNombres());
            preparedStatement.setString(2, cliente.getApellidos());
            preparedStatement.setString(3, cliente.getCorreoElectronico());
            preparedStatement.setString(4, cliente.getFechaNacimiento());
            preparedStatement.setString(5, cliente.getDireccion());
            preparedStatement.setString(6, cliente.getTelefono());
            preparedStatement.setString(7, cliente.getPreferenciasProductos());
            
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Otros métodos para actualizar y eliminar clientes según sea necesario
}
