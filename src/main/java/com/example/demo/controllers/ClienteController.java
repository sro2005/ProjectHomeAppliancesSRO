package com.example.demo.controllers;

import com.example.demo.models.Cliente;
import com.example.demo.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Método para mostrar el formulario de creación de cliente
    @GetMapping("/form")
    public String showForm(Model model) {
        // Agrega un nuevo cliente al modelo para ser utilizado en el formulario
        model.addAttribute("cliente", new Cliente());
        // Retorna el nombre de la vista del formulario
        return "cliente-form";
    }

    // Método para procesar el envío del formulario de cliente
    @PostMapping
    public String submitForm(Cliente cliente) {
        // Llama al servicio para crear un nuevo cliente con los datos enviados desde el formulario
        clienteService.crearCliente(cliente);
        // Redirige al usuario a la página principal después de enviar el formulario
        return "redirect:/";
    }
}
