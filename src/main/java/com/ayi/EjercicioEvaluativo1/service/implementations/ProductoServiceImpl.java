package com.ayi.EjercicioEvaluativo1.service.implementations;

import com.ayi.EjercicioEvaluativo1.entity.Producto;
import com.ayi.EjercicioEvaluativo1.entity.Servicio;
import com.ayi.EjercicioEvaluativo1.repository.IProductoRepository;
import com.ayi.EjercicioEvaluativo1.service.contracts.IProductoService;
import com.ayi.EjercicioEvaluativo1.service.contracts.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService {

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    @Transactional
    public void eliminar(Integer id) {

        Producto producto = productoRepository.getReferenceById(id);

        productoRepository.delete(producto);

    }
}
