package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pedidos.Pedido;
import pedidos.PedidoService;

@WebServlet("/pedido")
public class PedidoServlet extends HttpServlet {
    
    private PedidoService pedidoService;

    @Override
    public void init() throws ServletException {
        super.init();
        pedidoService = new PedidoService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
        String nombreCliente = request.getParameter("nombreCliente");
        String apellidosCliente = request.getParameter("apellidosCliente");
        String correoElectronico = request.getParameter("correoElectronico");
        String telefono = request.getParameter("telefono");
        String direccionEnvio = request.getParameter("direccionEnvio");
        String metodoPago = request.getParameter("metodoPago");
        String fechaEntrega = request.getParameter("fechaEntrega");
        String listaProductos = request.getParameter("listaProductos");
        String montoTotalStr = request.getParameter("montoTotal");
        double montoTotal = Double.parseDouble(montoTotalStr);

        // Crear un objeto Pedido con los datos recibidos
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

        // Agregar el pedido utilizando el servicio de pedido
        pedidoService.agregarPedido(pedido);

        // Redirigir o enviar una respuesta adecuada al cliente
        response.sendRedirect("index.jsp"); // Por ejemplo, redirigir a la página principal
    }

    public PedidoService getPedidoService() {
        return pedidoService;
    }

    public void setPedidoService(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }
}
