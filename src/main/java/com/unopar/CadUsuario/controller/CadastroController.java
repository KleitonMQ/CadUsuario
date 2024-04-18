package com.unopar.CadUsuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unopar.CadUsuario.dto.CadastroDTO;
import com.unopar.CadUsuario.service.CadastroService;

@Controller
@RequestMapping("/cadastro")
public class CadastroController {
    
    @Autowired
    private CadastroService cadastroService;

    @PostMapping("/salvar")
    public String salvarCadastro(@ModelAttribute CadastroDTO cadastroDTO){
        cadastroService.inserirCadastro(cadastroDTO);
        return "redirect:/sucesso";
    }
}
