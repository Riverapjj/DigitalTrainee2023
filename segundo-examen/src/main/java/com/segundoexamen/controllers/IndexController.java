package com.segundoexamen.controllers;

import com.segundoexamen.models.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/segundoexamen")
public class IndexController {

    @Autowired
    private Factura factura;

    @GetMapping({"", "/", "/index"})
    public String index(Model model) {
        model.addAttribute("titulo", "Facturas de " + factura.getRubro());
        model.addAttribute("factura", factura);
        model.addAttribute("cliente", factura.getCliente());

        return "index";
    }
}
