package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Pedido;
import com.example.demo.repositories.PedidoRepository;

// Esta clase actúa como un servicio para la entidad Pedido.
// Anotada con @Service para que Spring la reconozca como un componente de servicio.
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    // Se inyecta el PedidoRepository como dependencia en el constructor.
    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    // Método para crear un nuevo pedido.
    public Pedido crearPedido(Pedido pedido) {
        // Se utiliza el método save() del PedidoRepository para guardar el pedido en la base de datos.
        return pedidoRepository.save(pedido);
    }

    // Aquí podrían agregarse otros métodos para actualizar, eliminar y obtener pedidos según sea necesario.
}
