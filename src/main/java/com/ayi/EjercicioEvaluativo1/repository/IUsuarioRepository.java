package com.ayi.EjercicioEvaluativo1.repository;

import com.ayi.EjercicioEvaluativo1.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Integer> {

      Usuario findByNombre (String nombre);

/*@Query("SELECT u FROM Usuario u WHERE u.nombre LIKE :nombre and u.password LIKE :password")
   Usuario user (@Param("nombre") String nombre, @Param("password") String password);*/

}
