package com.sprinbootweb.controllers;

import com.sprinbootweb.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index", "/", "", "/home"})
    public String index(Model model) {

        model.addAttribute("titulo", "Hola Spring Framework");

        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Josue");
        usuario.setApellido("Rivera");
        usuario.setEmail("riverapj99@gmail.com");

        model.addAttribute("usuario", usuario);

        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {

        List<Usuario> usuarios = poblarUsuario();

        model.addAttribute("titulo", "Listado de usuarios");
        model.addAttribute("usuarios", usuarios);

        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuario() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Josue2", "Rivera2", "riverapj99@gmail.com"));
        usuarios.add(new Usuario("Josue2", "Rivera2", "riverapj99@gmail.com"));
        usuarios.add(new Usuario("Josue2", "Rivera2", "riverapj99@gmail.com"));

        return usuarios;
    }
}
