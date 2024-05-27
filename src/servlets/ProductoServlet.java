package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import inventario.Producto;
import inventario.ProductoService;

@WebServlet("/producto")
public class ProductoServlet extends HttpServlet {
    
    private ProductoService productoService;

    @Override
    public void init() throws ServletException {
        super.init();
        productoService = new ProductoService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String catalogoGeneral = request.getParameter("catalogoGeneral");
        String precioStr = request.getParameter("precio");
        double precio = Double.parseDouble(precioStr);
        String cantidadDisponibleStr = request.getParameter("cantidadDisponible");
        int cantidadDisponible = Integer.parseInt(cantidadDisponibleStr);
        String imagenUrl = request.getParameter("imagenUrl");

        // Crear un objeto Producto con los datos recibidos
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setDescripcion(descripcion);
        producto.setCatalogoGeneral(catalogoGeneral);
        producto.setPrecio(precio);
        producto.setCantidadDisponible(cantidadDisponible);
        producto.setImagenUrl(imagenUrl);

        // Agregar el producto utilizando el servicio de producto
        productoService.agregarProducto(producto);

        // Redirigir o enviar una respuesta adecuada al cliente
        response.sendRedirect("index.jsp"); // Por ejemplo, redirigir a la página principal
    }

    public ProductoService getProductoService() {
        return productoService;
    }

    public void setProductoService(ProductoService productoService) {
        this.productoService = productoService;
    }
}
