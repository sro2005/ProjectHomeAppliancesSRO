package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.Producto;
import com.example.demo.repositories.ProductoRepository;
import java.util.List;

// Esta clase actúa como un servicio para la entidad Producto.
// Anotada con @Service para que Spring la reconozca como un componente de servicio.
public class ProductoService {

    private final ProductoRepository productoRepository;

    // Se inyecta el ProductoRepository como dependencia en el constructor.
    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    // Método para obtener todos los productos.
    public List<Producto> obtenerTodosProductos() {
        // Se utiliza el método findAll() del ProductoRepository para obtener todos los productos de la base de datos.
        return productoRepository.findAll();
    }

    // Método para agregar un nuevo producto.
    public Producto agregarProducto(Producto producto) {
        // Se utiliza el método save() del ProductoRepository para guardar el producto en la base de datos.
        return productoRepository.save(producto);
    }

    // Aquí podrían agregarse otros métodos para actualizar, eliminar y obtener productos según sea necesario.
}
