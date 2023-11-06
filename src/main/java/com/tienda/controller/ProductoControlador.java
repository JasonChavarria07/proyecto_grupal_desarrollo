package com.tienda.controller;

import com.tienda.service.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jason
 */
@Controller

public class ProductoControlador {
    
    @Autowired
    private ProductoServicio servicio;
    
    @GetMapping({"/productos","/"})
    public String listarProductos(Model model){
        model.addAttribute("productos", servicio.listarProductos());
        return "productos";
    }
    
}
