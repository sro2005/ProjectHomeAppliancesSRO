package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import clientes.Cliente;
import clientes.ClienteService;

@WebServlet("/cliente")
public class ClienteServlet extends HttpServlet {
    
    private ClienteService clienteService;

    @Override
    public void init() throws ServletException {
        super.init();
        clienteService = new ClienteService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener parámetros del formulario
        String nombres = request.getParameter("nombres");
        String apellidos = request.getParameter("apellidos");
        String correoElectronico = request.getParameter("correoElectronico");
        String fechaNacimiento = request.getParameter("fechaNacimiento");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String preferenciasProductos = request.getParameter("preferenciasProductos");
        
        // Crear un objeto Cliente con los datos recibidos
        Cliente cliente = new Cliente();
        cliente.setNombres(nombres);
        cliente.setApellidos(apellidos);
        cliente.setCorreoElectronico(correoElectronico);
        cliente.setFechaNacimiento(fechaNacimiento);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setPreferenciasProductos(preferenciasProductos);
        
        // Agregar el cliente utilizando el servicio de cliente
        clienteService.agregarCliente(cliente);
        
        // Redirigir o enviar una respuesta adecuada al cliente
        response.sendRedirect("index.jsp"); // Por ejemplo, redirigir a la página principal
    }

    public ClienteService getClienteService() {
        return clienteService;
    }

    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
}
