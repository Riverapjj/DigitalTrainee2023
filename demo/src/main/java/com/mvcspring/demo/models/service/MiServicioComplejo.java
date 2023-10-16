package com.mvcspring.demo.models.service;


public class MiServicioComplejo implements IServicio{

    @Override
    public String operacion() {
        return "ejecutando algun proceso importante complejo...";
    }
}
