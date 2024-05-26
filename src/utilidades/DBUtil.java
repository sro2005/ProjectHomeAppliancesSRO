package utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // Configuración de la conexión a la base de datos
    private static final String URL = "http://localhost/phpmyadmin/index.php?route=/database/structure&db=projecthomeappliancessro";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";

    // Método para obtener una conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }
}
