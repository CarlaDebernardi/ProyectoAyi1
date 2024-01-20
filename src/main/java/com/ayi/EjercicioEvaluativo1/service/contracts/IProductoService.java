package com.ayi.EjercicioEvaluativo1.service.contracts;

import com.ayi.EjercicioEvaluativo1.entity.Producto;
import java.util.List;

public interface IProductoService {

    public List<Producto> listarProductos();

    public void eliminar(Integer id);
}
