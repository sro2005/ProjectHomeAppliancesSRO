package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Pedido;

// Esta interfaz actúa como un repositorio para la entidad Pedido.
// Extiende JpaRepository, que proporciona métodos predefinidos para realizar operaciones CRUD en la base de datos.
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // No es necesario implementar métodos para insertar, actualizar o eliminar pedidos
    // Spring Data JPA proporcionará automáticamente estos métodos en tiempo de ejecución
}
