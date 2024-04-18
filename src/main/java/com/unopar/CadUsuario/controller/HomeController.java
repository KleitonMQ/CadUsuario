package com.unopar.CadUsuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unopar.CadUsuario.service.CadastroService;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/sucesso")
    public String sucesso() {
        return "sucesso"; 
    }

}
