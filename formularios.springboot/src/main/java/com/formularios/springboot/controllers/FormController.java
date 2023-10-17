package com.formularios.springboot.controllers;

import com.formularios.springboot.editors.NombreMayusculaEditor;
import com.formularios.springboot.editors.PaisPropertyEditor;
import com.formularios.springboot.editors.RolesEditor;
import com.formularios.springboot.models.domain.Pais;
import com.formularios.springboot.models.domain.Role;
import com.formularios.springboot.services.PaisService;
import com.formularios.springboot.services.RoleService;
import com.formularios.springboot.validation.UsuarioValidador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@SessionAttributes("usuario")
public class FormController {

    @Autowired
    private UsuarioValidador validador;

    @Autowired
    private PaisService paisService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PaisPropertyEditor paisEditor;

    @Autowired
    private RolesEditor rolesEditor;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(validador);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);

        binder.registerCustomEditor(Date.class, "fechaNacimiento",
                new CustomDateEditor(dateFormat, true));

        binder.registerCustomEditor(String.class, "nombre",
                new NombreMayusculaEditor());
        binder.registerCustomEditor(String.class, "apellido",
                new NombreMayusculaEditor());

        binder.registerCustomEditor(Pais.class, "pais", paisEditor);
        binder.registerCustomEditor(Role.class, "role", rolesEditor);
    }
}
