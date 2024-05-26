package servlets;

import inventario.Producto;
import inventario.ProductoService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        double precio = Double.parseDouble(request.getParameter("precio"));
        int cantidadDisponible = Integer.parseInt(request.getParameter("cantidadDisponible"));
        String imagenUrl = request.getParameter("imagenUrl");
        
        // Crear un objeto Producto con los datos recibidos
        Producto producto = new Producto(0, nombre, descripcion, catalogoGeneral, precio, cantidadDisponible, imagenUrl);
        
        // Agregar el producto utilizando el servicio de productos
        productoService.agregarProducto(producto);
        
        // Redirigir o enviar una respuesta adecuada al cliente
        response.sendRedirect("index.jsp"); // Por ejemplo, redirigir a la página principal
    }
}
