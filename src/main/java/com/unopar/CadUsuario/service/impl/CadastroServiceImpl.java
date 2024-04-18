package com.unopar.CadUsuario.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unopar.CadUsuario.dto.CadastroDTO;
import com.unopar.CadUsuario.model.Cadastro;
import com.unopar.CadUsuario.repository.CadastroRepository;
import com.unopar.CadUsuario.service.CadastroService;

@Service
public class CadastroServiceImpl implements CadastroService{

    @Autowired
    private CadastroRepository cadastroRepository;

    @Override
    public void inserirCadastro(CadastroDTO cadastroDTO) {

        this.cadastroRepository.save(new Cadastro(cadastroDTO.getNome(), cadastroDTO.getSobrenome(),
        cadastroDTO.getEmail(), cadastroDTO.getSenha(), cadastroDTO.getCep(), cadastroDTO.getRua(),
        cadastroDTO.getBairro(), cadastroDTO.getCidade(), cadastroDTO.getEstado(), 
        cadastroDTO.getNumero(), cadastroDTO.getComplemento()));
    }
    
}
