package com.ayi.EjercicioEvaluativo1.controller;

import com.ayi.EjercicioEvaluativo1.entity.Usuario;
import com.ayi.EjercicioEvaluativo1.exception.UsuarioNoEncontradoException;
import com.ayi.EjercicioEvaluativo1.service.contracts.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class UsuarioController {

    private IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("login")
    public String login(Usuario usuario, String nombre, String password) {
        if (usuarioService.verificarUsuario(usuario, nombre, password) == false) {
            throw new UsuarioNoEncontradoException();
        } else return "lista";
    }

    @GetMapping("login1")
    public String login(Model modelo) {
        return "login.html";
    }
}
