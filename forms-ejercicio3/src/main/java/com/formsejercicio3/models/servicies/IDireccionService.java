package com.formsejercicio3.models.servicies;

import com.formsejercicio3.models.entity.Direccion;

import java.util.List;

public interface IDireccionService {
    public List<Direccion> findAll();
    public void save(Direccion direccion);
    public Direccion findOne(Long id);
    public void delete(Long id);
}
