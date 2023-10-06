package collection.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

    private String nombre;
    private Integer nota;

    public Alumno() {}

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public int compareTo(Alumno a) {
        if (this.nombre == null) {
            return 0;
        }

        return this.nombre.compareTo(a.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(getNombre(), alumno.getNombre()) && Objects.equals(getNota(), alumno.getNota());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getNota());
    }
}
