package test;

import inventario.Producto;
import inventario.ProductoDAO;
import java.util.List;

public class TestProductoDAO {
    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();

        // Crear y agregar un nuevo producto
        Producto nuevoProducto = new Producto(0, "Producto Test", "Descripción Test", "Catálogo Test", 100.0, 10, "imagen_url_test");
        productoDAO.agregarProducto(nuevoProducto);

        // Obtener todos los productos y mostrar en consola
        List<Producto> productos = productoDAO.obtenerTodosProductos();
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
    }
}
