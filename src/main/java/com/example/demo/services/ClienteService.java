package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Cliente;
import com.example.demo.repositories.ClienteRepository;

// Esta clase actúa como un servicio para la entidad Cliente.
// Anotada con @Service para que Spring la reconozca como un componente de servicio.
public class ClienteService {

    private final ClienteRepository clienteRepository;

    // Se inyecta el ClienteRepository como dependencia en el constructor.
    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Método para crear un nuevo cliente.
    public Cliente crearCliente(Cliente cliente) {
        // Se utiliza el método save() del ClienteRepository para guardar el cliente en la base de datos.
        return clienteRepository.save(cliente);
    }

    // Aquí podrían agregarse otros métodos para actualizar, eliminar y obtener clientes según sea necesario.
}
