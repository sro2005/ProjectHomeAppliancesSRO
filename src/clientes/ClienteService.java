package clientes;

public class ClienteService {
    private final ClienteDAO clienteDAO;

    public ClienteService() {
        this.clienteDAO = new ClienteDAO();
    }

    public void agregarCliente(Cliente cliente) {
        clienteDAO.agregarCliente(cliente);
    }

    // Otros métodos para actualizar, eliminar y obtener clientes según sea necesario
}

