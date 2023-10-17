package com.formularios.springboot.services;

import com.formularios.springboot.models.domain.Pais;
import com.formularios.springboot.models.domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role> listar();
    public Role obtenerporId(Integer id);
}
