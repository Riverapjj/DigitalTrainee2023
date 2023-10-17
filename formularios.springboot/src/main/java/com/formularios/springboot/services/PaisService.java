package com.formularios.springboot.services;

import com.formularios.springboot.models.domain.Pais;

import java.util.List;

public interface PaisService {

    public List<Pais> listar();
    public Pais obtenerporId(Integer id);
}
