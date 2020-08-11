package br.com.marcorp.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcorp.projetofinal.dao.AgendamentoDAO;
import br.com.marcorp.projetofinal.model.Agendamento;


@RestController
public class AgendamentoController {
	
	@Autowired
	AgendamentoDAO dao;
	
	@GetMapping("/agendamento")
	public ArrayList<Agendamento> getAll(){
		ArrayList<Agendamento> lista;
		lista = (ArrayList<Agendamento>)dao.findAll();
		return lista;
	}
	

}
