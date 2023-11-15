package com.formsejercicio3.models.servicies;

import com.formsejercicio3.models.dao.IDireccionDao;
import com.formsejercicio3.models.entity.Direccion;
import com.formsejercicio3.models.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DireccionServiceImpl implements IDireccionService {

    @Autowired
    private IDireccionDao direccionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Direccion> findAll() {
        return (List<Direccion>) direccionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Direccion findOne(Long id) {
        return direccionDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void save(Direccion direccion) {
        direccionDao.save(direccion);
    }

    @Override
    public void delete(Long id) {
        direccionDao.deleteById(id);
    }
}
