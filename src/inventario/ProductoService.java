package inventario;

import java.util.List;

public class ProductoService {
    private final ProductoDAO productoDAO;

    public ProductoService() {
        this.productoDAO = new ProductoDAO();
    }

    public List<Producto> obtenerTodosProductos() {
        return productoDAO.obtenerTodosProductos();
    }

    public void agregarProducto(Producto producto) {
        // Aquí puedes agregar lógica adicional antes de llamar al método en ProductoDAO, si es necesario
        productoDAO.agregarProducto(producto);
    }

    // Aquí puedes agregar otros métodos de servicio relacionados con productos, como actualizarProducto(), eliminarProducto(), etc.
}
