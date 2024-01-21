package com.ayi.EjercicioEvaluativo1.controller;

import com.ayi.EjercicioEvaluativo1.entity.Producto;
import com.ayi.EjercicioEvaluativo1.service.contracts.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductoController {


    @Autowired
    private IProductoService productoService;

    @GetMapping("/eliminarProducto/{id}")
    public String eliminar(@PathVariable Integer id, Model model) {
        productoService.eliminar(id);
        return "redirect:../listadopys";
    }

    @GetMapping("/nuevoProducto")
    public String nuevoProducto(Model model){
        model.addAttribute("producto", new Producto());
        return "producto_form.html";
    }

    @PostMapping("/guardarProducto")
    public String nuevoProducto(@ModelAttribute("producto") Producto producto) {
        productoService.crearProducto(producto);
        return "redirect:/listadopys";
    }

}
