package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // Configuración de la conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/nombre_base_datos";
    private static final String USUARIO = "usuario";
    private static final String CONTRASENA = "contraseña";

    // Método para obtener una conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}
