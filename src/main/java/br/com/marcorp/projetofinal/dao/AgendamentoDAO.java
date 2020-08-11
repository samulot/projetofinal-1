package br.com.marcorp.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.marcorp.projetofinal.model.Agendamento;

public interface AgendamentoDAO extends CrudRepository <Agendamento, Integer> {

}
