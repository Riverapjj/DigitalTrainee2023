package modelo;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Pelicula {

    private String nombrePelicula;
    private Date peliculaEspectaculo;
    private String lugar;

    public Pelicula(String nombrePelicula, Date peliculaEspectaculo, String lugar) {
        this.nombrePelicula = nombrePelicula;
        this.peliculaEspectaculo = peliculaEspectaculo;
        this.lugar = lugar;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public Date getPeliculaEspectaculo() {
        return peliculaEspectaculo;
    }

    public void setPeliculaEspectaculo(Date peliculaEspectaculo) {
        this.peliculaEspectaculo = peliculaEspectaculo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
