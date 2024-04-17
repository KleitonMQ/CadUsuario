package com.unopar.CadUsuario.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unopar.CadUsuario.model.Cadastro;

public interface CadastroRepository extends MongoRepository<Cadastro, String>{
    
}
