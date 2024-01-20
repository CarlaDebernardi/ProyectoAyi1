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

//        try {
        productoService.eliminar(id);
        return "redirect:../listadopys";
//        } catch (MiException ex) {
//            modelo.put("error", ex.getMessage());
//            return "redirect:../listadopys";
//        }

    }

    @GetMapping("/nuevoProducto")
    public String nuevoProducto(Model model){
        model.addAttribute("producto", new Producto());
        return "producto_form.html";
    }

    @PostMapping("/guardarProducto")
    public String nuevoProducto(@ModelAttribute("producto") Producto producto){
//        try {
            productoService.crearProducto(producto);

//            modelo.put("exito", "La noticia fue creada correctamente!");
//        } catch (MiException | IOException | IllegalStateException ex) {

//            modelo.put("error", ex.getMessage());
//            return "noticia_form.html";
//        }
        return "redirect:/listadopys";
//        return "producto_form.html";
//        return "index.html";
    }

}
