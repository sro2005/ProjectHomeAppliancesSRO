package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Cliente;

// Esta interfaz actúa como un repositorio para la entidad Cliente.
// Extiende JpaRepository, que proporciona métodos predefinidos para realizar operaciones CRUD en la base de datos.
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // No es necesario implementar métodos para insertar, actualizar o eliminar clientes
    // Spring Data JPA proporcionará automáticamente estos métodos en tiempo de ejecución
}
