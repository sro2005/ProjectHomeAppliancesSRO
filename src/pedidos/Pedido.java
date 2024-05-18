package pedidos;

public class Pedido {
    private int id;
    private String nombreCliente;
    private String apellidosCliente;
    private String correoElectronico;
    private String telefono;
    private String direccionEnvio;
    private String metodoPago;
    private String fechaEntrega;
    private String listaProductos;
    private double montoTotal;

    // Constructor vacío
    public Pedido() {
    }

    // Constructor con parámetros
    public Pedido(int id, String nombreCliente, String apellidosCliente, String correoElectronico, String telefono, String direccionEnvio, String metodoPago, String fechaEntrega, String listaProductos, double montoTotal) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.direccionEnvio = direccionEnvio;
        this.metodoPago = metodoPago;
        this.fechaEntrega = fechaEntrega;
        this.listaProductos = listaProductos;
        this.montoTotal = montoTotal;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(String listaProductos) {
        this.listaProductos = listaProductos;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
}

