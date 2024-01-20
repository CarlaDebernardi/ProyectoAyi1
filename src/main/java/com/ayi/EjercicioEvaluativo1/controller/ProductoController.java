package com.ayi.EjercicioEvaluativo1.controller;

import com.ayi.EjercicioEvaluativo1.service.contracts.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductoController {


    @Autowired
    private IProductoService productoService;

    @GetMapping("/eliminarProducto/{id}")
    public String eliminar(@PathVariable Integer id, Model model) {

//        try {
        productoService.eliminar(id);
        return "redirect:../listadopys";
//        } catch (MiException ex) {
//            modelo.put("error", ex.getMessage());
//            return "redirect:../listadopys";
//        }

    }

}
