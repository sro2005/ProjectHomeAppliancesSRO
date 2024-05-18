package inventario;

public class Producto {
    // Atributos
    private int id;
    private String nombre;
    private String descripcion;
    private String catalogoGeneral;
    private double precio;
    private int cantidadDisponible;
    private String imagenUrl;

    // Constructor
    public Producto(int id, String nombre, String descripcion, String catalogoGeneral, double precio, int cantidadDisponible, String imagenUrl) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.catalogoGeneral = catalogoGeneral;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.imagenUrl = imagenUrl;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCatalogoGeneral() {
        return catalogoGeneral;
    }

    public void setCatalogoGeneral(String catalogoGeneral) {
        this.catalogoGeneral = catalogoGeneral;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
}

