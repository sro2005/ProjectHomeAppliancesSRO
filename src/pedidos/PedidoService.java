package pedidos;

public class PedidoService {
    private final PedidoDAO pedidoDAO;

    public PedidoService() {
        this.pedidoDAO = new PedidoDAO();
    }

    public void agregarPedido(Pedido pedido) {
        pedidoDAO.agregarPedido(pedido);
    }

    // Otros métodos para actualizar, eliminar y obtener pedidos según sea necesario
}
