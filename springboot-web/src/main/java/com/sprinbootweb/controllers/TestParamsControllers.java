package com.sprinbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/app")
public class TestParamsControllers {

    @GetMapping("/test")
    public String mostrarDatos(@RequestParam String nombre, @RequestParam String apellido,
                               @RequestParam String dui, @RequestParam String fechaNacimiento, Model model) {

        model.addAttribute("resultado",
                "Nombre: " + nombre +
                        " Apellido: " + apellido +
                " DUI: " + dui +
                " Fecha de nacimiento: " + fechaNacimiento);

        return "test";
    }
}
