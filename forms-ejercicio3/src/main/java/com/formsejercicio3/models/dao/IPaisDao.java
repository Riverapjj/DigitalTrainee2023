package com.formsejercicio3.models.dao;

import com.formsejercicio3.models.entity.Pais;
import org.springframework.data.repository.CrudRepository;

public interface IPaisDao extends CrudRepository<Pais, Long> {
}
