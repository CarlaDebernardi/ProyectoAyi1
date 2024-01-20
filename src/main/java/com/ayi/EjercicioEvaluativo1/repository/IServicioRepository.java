package com.ayi.EjercicioEvaluativo1.repository;

import com.ayi.EjercicioEvaluativo1.entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IServicioRepository extends JpaRepository <Servicio, Integer> {
}
