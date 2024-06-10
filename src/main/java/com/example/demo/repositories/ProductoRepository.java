package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Producto;

// Esta interfaz actúa como un repositorio para la entidad Producto.
// Extiende JpaRepository, que proporciona métodos predefinidos para realizar operaciones CRUD en la base de datos.
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // No es necesario implementar métodos para obtener, insertar, actualizar o eliminar productos
    // Spring Data JPA proporcionará automáticamente estos métodos en tiempo de ejecución
}
