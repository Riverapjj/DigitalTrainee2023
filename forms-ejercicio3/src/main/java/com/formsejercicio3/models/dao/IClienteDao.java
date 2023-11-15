package com.formsejercicio3.models.dao;

import com.formsejercicio3.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
}
