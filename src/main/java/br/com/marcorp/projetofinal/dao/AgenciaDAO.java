package br.com.marcorp.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.marcorp.projetofinal.model.Agencia;

public interface AgenciaDAO extends CrudRepository <Agencia, Integer> {
	public Agencia findByNome(String nome);
	
	

}
