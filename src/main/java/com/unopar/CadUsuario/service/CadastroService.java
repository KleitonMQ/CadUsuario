package com.unopar.CadUsuario.service;

import com.unopar.CadUsuario.model.Cadastro;

public interface CadastroService {
    
    Cadastro inserirCadastro(String nome, String sobrenome, String email, String senha, String cep, String rua, String bairro,
    String cidade, String estado, String numero, String complemento);
}
