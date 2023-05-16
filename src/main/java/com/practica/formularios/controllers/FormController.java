package com.practica.formularios.controllers;

import com.practica.formularios.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("titulo", "Formulario usuarios");
        return "form";
    }

   /* @PostMapping("/form")
    public String procesar(@RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String email,
                           Model model){

        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(password);
        usuario.setEmail(email);

        model.addAttribute("titulo", "Resultado form");
        model.addAttribute("usuario", usuario);
        return "resultado";
    }*/

    //OPTIMIZANDO PARA RECIBIR COMO OBJETO
      @PostMapping("/form")
    public String procesar(Usuario usuario,
                           Model model){

        model.addAttribute("titulo", "Resultado form");
        model.addAttribute("usuario", usuario);
        return "resultado";
    }

}
