package clientes;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;
    private String preferenciasProductos;

    // Constructores

    // Getters y setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPreferenciasProductos() {
        return preferenciasProductos;
    }

    public void setPreferenciasProductos(String preferenciasProductos) {
        this.preferenciasProductos = preferenciasProductos;
    }

    // Otros getters y setters para los demás atributos
}
