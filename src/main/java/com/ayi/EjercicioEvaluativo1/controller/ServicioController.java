package com.ayi.EjercicioEvaluativo1.controller;

import com.ayi.EjercicioEvaluativo1.service.contracts.IProductoService;
import com.ayi.EjercicioEvaluativo1.service.contracts.IServicioService;
import com.ayi.EjercicioEvaluativo1.service.contracts.IUsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicioController {

    @Value("${titulo1}")
    private String titulo1;

    @Value("${titulo2}")
    private String titulo2;

    @Autowired
    private IServicioService servicioService;

    @Autowired
    private IProductoService productoService;
    @GetMapping("/listadopys")
    public String listadopys(Model model) {
        var productos = productoService.listarProductos();
        var servicios = servicioService.listarServicios();

        model.addAttribute("titulo1", titulo1);
        model.addAttribute("titulo2", titulo2);
        model.addAttribute("productos", productos);
        model.addAttribute("servicios", servicios);
        return "listados.html";
    }




}
