package com.folha_de_pagamento.Api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.folha_de_pagamento.Api.entity.Funcionario;

public interface FuncionarioRepository  extends MongoRepository<Funcionario, String>{

}
