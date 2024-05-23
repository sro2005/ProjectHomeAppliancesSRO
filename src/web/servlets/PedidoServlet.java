package web.servlets;

import pedidos.Pedido;
import pedidos.PedidoService;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pedido")
public class PedidoServlet extends HttpServlet {

    private PedidoService pedidoService;

    @Override
    public void init() throws ServletException {
        pedidoService = new PedidoService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Pedido> pedidos = pedidoService.obtenerTodosPedidos();
        request.setAttribute("pedidos", pedidos);
        request.getRequestDispatcher("jsp/pedidos.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreCliente = request.getParameter("nombreCliente");
        String apellidosCliente = request.getParameter("apellidosCliente");
        String correoElectronico = request.getParameter("correoElectronico");
        String telefono = request.getParameter("telefono");
        String direccionEnvio = request.getParameter("direccionEnvio");
        String metodoPago = request.getParameter("metodoPago");
        String fechaEntrega = request.getParameter("fechaEntrega");
        String listaProductos = request.getParameter("listaProductos");
        double montoTotal = Double.parseDouble(request.getParameter("montoTotal"));

        Pedido pedido = new Pedido();
        pedido.setNombreCliente(nombreCliente);
        pedido.setApellidosCliente(apellidosCliente);
        pedido.setCorreoElectronico(correoElectronico);
        pedido.setTelefono(telefono);
        pedido.setDireccionEnvio(direccionEnvio);
        pedido.setMetodoPago(metodoPago);
        pedido.setFechaEntrega(fechaEntrega);
        pedido.setListaProductos(listaProductos);
        pedido.setMontoTotal(montoTotal);

        pedidoService.agregarPedido(pedido);

        response.sendRedirect("pedido");
    }
}
