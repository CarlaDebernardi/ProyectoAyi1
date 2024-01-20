package com.ayi.EjercicioEvaluativo1.controller;

import com.ayi.EjercicioEvaluativo1.entity.Usuario;
import com.ayi.EjercicioEvaluativo1.service.contracts.IUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UsuarioController {
 @Autowired
 private IUsuarioService usuarioService;

    /*    private IUsuarioService usuarioService;

    public UsuarioController(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
*/

    @RequestMapping("/login")
    public String mostrarFormularioLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String procesarFormularioLogin(@RequestParam String nombre, @RequestParam String password, Model model) {
        Usuario usuario = usuarioService.verificarUsuario(nombre, password);

        if (usuario != null) {

            return "listados.html";
        } else {
            model.addAttribute("error", "El nombre o contraseña no corresponden con un usuario registrado");
            return "login.html";
        }
    }
}

