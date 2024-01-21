package com.ayi.EjercicioEvaluativo1.service.contracts;

import com.ayi.EjercicioEvaluativo1.entity.Usuario;
import org.springframework.stereotype.Service;


public interface IUsuarioService {


    Usuario save(Usuario usuario);

    Usuario update(Integer id, Usuario usuario);

    Usuario findById(Usuario usuario);

    void delete(Usuario usuario);


}
