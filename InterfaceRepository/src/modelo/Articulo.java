package modelo;

public class Articulo {

    private Integer id;
    private String nombre;
    private String descripcion;
    private double precio;
    private static Integer ultimoId;

    public Articulo() {
        this.id = ++ultimoId;
    }

    public Articulo(String nombre, String descripcion, double precio) {
        this();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static Integer getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(Integer ultimoId) {
        Articulo.ultimoId = ultimoId;
    }
}
