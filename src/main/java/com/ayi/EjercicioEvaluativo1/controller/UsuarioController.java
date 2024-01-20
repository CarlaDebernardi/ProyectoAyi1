package com.ayi.EjercicioEvaluativo1.controller;

import com.ayi.EjercicioEvaluativo1.entity.Usuario;
import com.ayi.EjercicioEvaluativo1.exception.UsuarioNoEncontradoException;
import com.ayi.EjercicioEvaluativo1.service.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("login")
    public String login (Usuario usuario, String nombre){
      if(usuarioService.verificarUsuario(usuario, nombre) == false){
          throw new UsuarioNoEncontradoException();
      }
      else return "lista";
    }
}
