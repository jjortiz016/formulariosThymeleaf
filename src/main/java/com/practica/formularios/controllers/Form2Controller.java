package com.practica.formularios.controllers;

import com.practica.formularios.models.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Form2Controller {

    @GetMapping("/form2")
    public String form2(Model model){
        Usuario usuario= new Usuario();
        model.addAttribute("titulo", "Formulario usuarios con field");
        model.addAttribute("usuario", usuario);
        return "form2";

    }
    @PostMapping("/form2")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model){
        model.addAttribute("titulo", "Resultado form2");
        if(result.hasErrors()){
            return "form2";
        }

        model.addAttribute("usuario", usuario);
        return "resultado";

    }



}
