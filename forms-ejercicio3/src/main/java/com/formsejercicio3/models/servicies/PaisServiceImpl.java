package com.formsejercicio3.models.servicies;

import com.formsejercicio3.models.dao.IPaisDao;
import com.formsejercicio3.models.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaisServiceImpl implements IPaisService{

    @Autowired
    private IPaisDao paisDao;

    @Override
    @Transactional(readOnly = true)
    public List<Pais> findAll() {
        return (List<Pais>) paisDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Pais findOne(Long id) {
        return paisDao.findById(id).orElse(null);
    }

}
