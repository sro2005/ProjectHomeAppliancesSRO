package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDBConnection {
    public static void main(String[] args) {
        // Establecer la conexión
        try {
            @SuppressWarnings("unused")
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/home_appliances", "root", "");
            System.out.println("Conexión exitosa!");
            // Aquí puedes realizar operaciones en la base de datos
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
}
