package com.mvcspring.demo.models.service;

public class MiServicio implements IServicio{

    @Override
    public String operacion() {
        return "ejecutando algun proceso importante simple...";
    }
}
