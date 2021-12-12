package com.folha_de_pagamento.Api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.folha_de_pagamento.Api.entity.Funcionario;
import com.folha_de_pagamento.Api.repository.FuncionarioRepository;
import com.folha_de_pagamento.Api.service.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Override
	public List<Funcionario> obterTodos() {
		return this.funcionarioRepository.findAll();
	}

	@Override
	public Funcionario obterPorCodigo(String codigo) {
		return this.funcionarioRepository
				.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("funcionário não existe"));
	}

	@Override
	public Funcionario criar(Funcionario funcionario) {
		return this.funcionarioRepository.save(funcionario);
	}

}
