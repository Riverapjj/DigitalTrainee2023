package com.formsejercicio3.models.servicies;


import com.formsejercicio3.models.entity.Pais;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPaisService {

    public List<Pais> findAll();
    public Pais findOne(Long id);
}
