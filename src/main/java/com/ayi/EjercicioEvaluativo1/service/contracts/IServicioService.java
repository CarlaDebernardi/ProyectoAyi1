package com.ayi.EjercicioEvaluativo1.service.contracts;

import com.ayi.EjercicioEvaluativo1.entity.Servicio;
import java.util.List;

public interface IServicioService {

    public List<Servicio> listarServicios();

    public void eliminar(Integer id);
}
