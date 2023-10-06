package modelo;

import java.util.Date;

public class Billete {

    private String nombrePelicula;
    private Integer mostrarNumero;
    private Date fecha;
    private String lugar;

    public Billete(String nombrePelicula, Integer mostrarNumero, Date fecha, String lugar) {
        this.nombrePelicula = nombrePelicula;
        this.mostrarNumero = mostrarNumero;
        this.fecha = fecha;
        this.lugar = lugar;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Integer getMostrarNumero() {
        return mostrarNumero;
    }

    public void setMostrarNumero(Integer mostrarNumero) {
        this.mostrarNumero = mostrarNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
