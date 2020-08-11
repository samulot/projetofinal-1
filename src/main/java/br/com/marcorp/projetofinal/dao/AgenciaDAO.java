package br.com.marcorp.projetofinal.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.marcorp.projetofinal.model.Agencia;

public interface AgenciaDAO extends CrudRepository <Agencia, Integer> {
	public Agencia findByNome(String nome);
	public ArrayList<Agencia> findAllByOrderByNome();
	
	

}
