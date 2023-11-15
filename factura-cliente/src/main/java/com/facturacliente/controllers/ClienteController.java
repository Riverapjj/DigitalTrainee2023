package com.facturacliente.controllers;

import com.facturacliente.models.dao.IClienteDao;
import com.facturacliente.models.entity.Cliente;


import com.facturacliente.models.service.IClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

@Controller
@SessionAttributes("clientes")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping(value = "/ver/{id}")
    public String ver(@PathVariable(value = "id") Long id, Map<String, Object> model,
                      RedirectAttributes flash) {

        Cliente cliente = clienteService.findOne(id);

        if (cliente == null) {
            flash.addFlashAttribute("error", "El cliente no existe en la DB");
            return "redirect:/listar";
        }

        model.put("cliente", cliente);
        model.put("titulo", "Detalle cliente" + cliente.getNombre());
        return "ver";
    }

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {

        Pageable pageRequest = PageRequest.of(page, 5);
        Page<Cliente> clientes = clienteService.findAll(pageRequest);
        PageRender<Cliente> pageRender = new PageRender<>("/listar", clientes);

        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("clientes", clientes);
        model.addAttribute("page", pageRender);

        return "listar";
    }

    @RequestMapping(value = "/form")
    public String crear(Map<String, Object> model) {

        Cliente cliente = new Cliente();
        model.put("cliente", cliente);
        model.put("titulo", "Formulario de cliente");
        return "form";
    }

    @RequestMapping(value = "/form/{id}")
    public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model,
                         RedirectAttributes flash) {
        Cliente cliente = null;

        if (id > 0) {
            cliente = clienteService.findOne(id);
            if (cliente == null) {
                flash.addFlashAttribute("error", "El ID del cliente no existe en la DB.");
                return "redirect:/listar";
            }
        } else {
            flash.addFlashAttribute("error", "El ID del cliente no existe en la DB.");
            return "redirect:/listar";
        }

        model.put("cliente", cliente);
        model.put("titulo", "Editar cliente");
        return  "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String guardar(@Valid Cliente cliente, BindingResult result,
                          @RequestParam("file") MultipartFile foto, Model model,
                          RedirectAttributes flash, SessionStatus status) {
        if (result.hasErrors()) {
            model.addAttribute("titulo", "Formulario de cliente");
            return "form";
        }

        if (!foto.isEmpty()) {
            Path directorioRecursos = Paths.get("src//main//resources//static/upload");
            String rootPath = directorioRecursos.toFile().getAbsolutePath();

            try {
                byte[] bytes = foto.getBytes();
                Path rutaCompleta = Paths.get(rootPath + "//" + foto.getOriginalFilename());
                Files.write(rutaCompleta, bytes);
                flash.addFlashAttribute("info", "Has subido la foto '" +
                        foto.getOriginalFilename() + "'");

                cliente.setFoto(foto.getOriginalFilename());
            }catch (IOException e) {

            }
        }

        String mensajeFlash = (cliente.getId() != null) ? "Cliente editado con exito!" : "Cliente creado con exito!";

        clienteService.save(cliente);
        status.setComplete();
        flash.addFlashAttribute("success", mensajeFlash);
        return "redirect:listar";
    }

    @RequestMapping(value = "/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash) {
        if (id > 0) {
            clienteService.delete(id);
            flash.addFlashAttribute("success", "Cliente eliminado con exito!");
        }
        return "redirect:/listar";
    }


}
