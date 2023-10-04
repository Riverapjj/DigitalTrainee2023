package modelo;

import modelo.Hoja;
import modelo.Imprimible;

public class Informe extends Hoja implements Imprimible {

    private Persona autor;
    private Persona revisor;

    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "modelo.Informe escrito por: " + autor
                + " Revisado por: " + revisor
                + "\n" + this.contenido;
    }
}
