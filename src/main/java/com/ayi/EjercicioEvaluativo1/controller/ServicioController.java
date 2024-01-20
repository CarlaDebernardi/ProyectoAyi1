package com.ayi.EjercicioEvaluativo1.controller;

import com.ayi.EjercicioEvaluativo1.entity.Producto;
import com.ayi.EjercicioEvaluativo1.entity.Servicio;
import com.ayi.EjercicioEvaluativo1.service.contracts.IProductoService;
import com.ayi.EjercicioEvaluativo1.service.contracts.IServicioService;
import com.ayi.EjercicioEvaluativo1.service.contracts.IUsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/eliminarServicio/{id}")
    public String eliminar(@PathVariable Integer id, Model model) {

//        try {
        servicioService.eliminar(id);
            return "redirect:../listadopys";
//        } catch (MiException ex) {
//            modelo.put("error", ex.getMessage());
//            return "redirect:../listadopys";
//        }

    }

    @GetMapping("/nuevoServicio")
    public String nuevoServicio(Model model){
        model.addAttribute("servicio", new Servicio());
        return "servicio_form.html";
    }

    @PostMapping("/guardarServicio")
    public String guardarServicio(@ModelAttribute("servicio") Servicio servicio){
//        try {
        servicioService.crearServicio(servicio);

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
