package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // No es necesario implementar métodos para obtener, insertar, actualizar o eliminar productos
    // Spring Data JPA proporcionará automáticamente estos métodos en tiempo de ejecución
}

