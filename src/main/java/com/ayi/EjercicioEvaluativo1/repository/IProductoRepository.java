package com.ayi.EjercicioEvaluativo1.repository;

import com.ayi.EjercicioEvaluativo1.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository <Producto, Integer>{
}
