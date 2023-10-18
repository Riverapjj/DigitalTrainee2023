package com.segundoexamen.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

public class Categoria {


    private String nombre;

    public Categoria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
