package com.unopar.CadUsuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.unopar.CadUsuario.model.Cadastro;
import com.unopar.CadUsuario.service.CadastroService;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {
    
    @Autowired
    private CadastroService cadastroService;

    @PostMapping("/salvar")
    public String salvarCadastro(@RequestParam("nome") String nome){
        Cadastro cadastro = new Cadastro();
        return "redirect:/sucesso";
    }
}
