package com.example.demo.controllers;

import com.example.demo.models.Producto;
import com.example.demo.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Método para mostrar el formulario de creación de productos
    @GetMapping("/form")
    public String showForm(Model model) {
        // Agrega un nuevo producto al modelo para ser utilizado en el formulario
        model.addAttribute("producto", new Producto());
        // Retorna el nombre de la vista del formulario
        return "producto-form";
    }

    // Método para procesar el envío del formulario de productos
    @PostMapping
    public String submitForm(Producto producto) {
        // Llama al servicio para crear un nuevo producto con los datos enviados desde el formulario
        productoService.crearProducto(producto);
        // Redirige al usuario a la página principal después de enviar el formulario
        return "redirect:/";
    }
}

