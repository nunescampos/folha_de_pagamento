package com.folha_de_pagamento.Api.service;

import java.util.*;

import com.folha_de_pagamento.Api.entity.Funcionario;

public interface FuncionarioService {

	public List<Funcionario> obterTodos();
	
	public Funcionario obterPorCodigo(String codigo);
	
	public Funcionario criar(Funcionario funcionario);
}
