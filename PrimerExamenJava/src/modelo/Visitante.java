package modelo;

public class Visitante {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String registrarse() {
        return "Se ha registrado con exito!";
    }
}
