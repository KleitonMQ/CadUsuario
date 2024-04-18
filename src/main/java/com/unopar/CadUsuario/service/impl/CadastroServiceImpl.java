package com.unopar.CadUsuario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unopar.CadUsuario.model.Cadastro;
import com.unopar.CadUsuario.repository.CadastroRepository;
import com.unopar.CadUsuario.service.CadastroService;

@Service
public class CadastroServiceImpl implements CadastroService{

    @Autowired
    private CadastroRepository cadastroRepository;

    @Override
    public void inserirCadastro(String nome, String sobrenome, String email, String senha, 
    String cep, String rua, String bairro, String cidade, String estado, String numero, 
    String complemento) {

        this.cadastroRepository.save(new Cadastro(nome, sobrenome, email, senha, cep, rua, bairro, 
        cidade, estado, numero, complemento));
    }
    
}
