package web.servlets;

import inventario.Producto;
import inventario.ProductoService;

import java.io.IOException;
import java.util.List;

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
        productoService = new ProductoService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Producto> productos = productoService.obtenerTodosProductos();
        request.setAttribute("productos", productos);
        request.getRequestDispatcher("jsp/productos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String catalogoGeneral = request.getParameter("catalogoGeneral");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int cantidadDisponible = Integer.parseInt(request.getParameter("cantidadDisponible"));
        String imagenUrl = request.getParameter("imagenUrl");

        Producto producto = new Producto(0, nombre, descripcion, catalogoGeneral, precio, cantidadDisponible, imagenUrl);

        productoService.agregarProducto(producto);

        response.sendRedirect("producto");
    }
}
