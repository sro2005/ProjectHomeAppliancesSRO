package com.example.demo.controllers;

import com.example.demo.models.Pedido;
import com.example.demo.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pedido")
public class PedidoController {

    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    // Método para mostrar el formulario de creación de pedido
    @GetMapping("/form")
    public String showForm(Model model) {
        // Agrega un nuevo pedido al modelo para ser utilizado en el formulario
        model.addAttribute("pedido", new Pedido());
        // Retorna el nombre de la vista del formulario
        return "pedido-form";
    }

    // Método para procesar el envío del formulario de pedido
    @PostMapping
    public String submitForm(Pedido pedido) {
        // Llama al servicio para crear un nuevo pedido con los datos enviados desde el formulario
        pedidoService.crearPedido(pedido);
        // Redirige al usuario a la página principal después de enviar el formulario
        return "redirect:/";
    }
}
