package web.servlets;

import cliente.Cliente;
import cliente.ClienteService;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {

    private ClienteService clienteService;

    @Override
    public void init() throws ServletException {
        clienteService = new ClienteService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Cliente> clientes = clienteService.obtenerTodosClientes();
        request.setAttribute("clientes", clientes);
        request.getRequestDispatcher("jsp/clientes.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String correoElectronico = request.getParameter("correoElectronico");
        String fechaNacimiento = request.getParameter("fechaNacimiento");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String preferenciasProductos = request.getParameter("preferenciasProductos");

        Cliente cliente = new Cliente();
        cliente.setNombres(nombres);
        cliente.setApellidos(apellidos);
        cliente.setCorreoElectronico(correoElectronico);
        cliente.setFechaNacimiento(fechaNacimiento);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setPreferenciasProductos(preferenciasProductos);

        clienteService.agregarCliente(cliente);

        response.sendRedirect("cliente");
    }
}
