package com.ayi.EjercicioEvaluativo1.service.contracts;

import com.ayi.EjercicioEvaluativo1.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;


public interface IUsuarioService {


    @Transactional
    Usuario save(Usuario usuario);

    @Transactional
    Usuario update(Integer id, Usuario usuario);

    @Transactional
    Usuario findById(Usuario usuario);

    @Transactional
    void delete(Usuario usuario);

    public boolean verificarUsuario (Usuario usuario, String nombre, String password);
}
