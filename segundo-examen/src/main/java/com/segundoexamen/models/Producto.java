package com.segundoexamen.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

public class Producto {

    private String nombre;

    private Integer precio;

    private Categoria categoria;

    private Procedencia procedencia;

    public Producto(String nombre, Integer precio, Categoria categoria, Procedencia procedencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.procedencia = procedencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(Procedencia procedencia) {
        this.procedencia = procedencia;
    }
}
