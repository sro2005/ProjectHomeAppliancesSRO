package test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import utilidades.DBUtil;

public class TestDBConnection {
    public static void main(String[] args) {
        try (Connection connection = DBUtil.getConnection()) {
            System.out.println("Conexión exitosa a la base de datos");

            // Crear una tabla de prueba
            String createTableSQL = "CREATE TABLE IF NOT EXISTS prueba_conexion ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY, "
                    + "mensaje VARCHAR(255) NOT NULL)";
            try (Statement statement = connection.createStatement()) {
                statement.execute(createTableSQL);
                System.out.println("Tabla de prueba creada exitosamente");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }
}
