package com.unopar.CadUsuario.service;

public interface CadastroService {
    
    void inserirCadastro(String nome, String sobrenome, String email, String senha, String cep, String rua, String bairro,
    String cidade, String estado, String numero, String complemento);
}
