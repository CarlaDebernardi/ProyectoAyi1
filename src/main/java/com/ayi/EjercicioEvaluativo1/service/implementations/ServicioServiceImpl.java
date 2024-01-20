package com.ayi.EjercicioEvaluativo1.service.implementations;
import java.util.List;

import com.ayi.EjercicioEvaluativo1.entity.Servicio;
import com.ayi.EjercicioEvaluativo1.repository.IServicioRepository;
import com.ayi.EjercicioEvaluativo1.service.contracts.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicioServiceImpl implements IServicioService {

    @Autowired
    private IServicioRepository servicioRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Servicio> listarServicios() {
        return servicioRepository.findAll();
    }

    @Override
    @Transactional
    public void eliminar(Integer id) {

        Servicio servicio = servicioRepository.getReferenceById(id);

        servicioRepository.delete(servicio);

    }

}
