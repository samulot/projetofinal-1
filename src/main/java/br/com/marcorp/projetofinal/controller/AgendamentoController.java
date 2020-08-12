package br.com.marcorp.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcorp.projetofinal.dao.AgendamentoDAO;
import br.com.marcorp.projetofinal.model.Agencia;
import br.com.marcorp.projetofinal.model.Agendamento;


@RestController
@CrossOrigin ("*")
public class AgendamentoController {
	
	@Autowired
	AgendamentoDAO dao;
	
	@PostMapping("/agendamentos/novo")
	public ResponseEntity<Agendamento> inserirNovoAgendamento(@RequestBody Agendamento novo){
		try {
			dao.save(novo);
			return ResponseEntity.status(201).body(novo);
		}
		catch(Exception ex) {
			return ResponseEntity.status(400).build(); // requisicao errada
		}
		
	}
		
	@GetMapping("/agendamentos/todos")
	public ArrayList<Agendamento> getAll(){
		ArrayList<Agendamento> lista;
		lista = (ArrayList<Agendamento>)dao.findAll();
		return lista;
	}
	
	@GetMapping("/agendamentos/filtarporcliente")
	public ArrayList<Agendamento> filtrarPorCliente(@RequestParam(name="nomecli") String nome){
		System.out.println("nome do cliente = "+nome);
		return dao.findAllByNomeClienteContaining(nome);
	}
	
	@GetMapping("/agendamentos/filtrarporagencia")
	public ArrayList<Agendamento> filtrarPorAgencia(@RequestParam(name="agencia") int agencia){
		System.out.println("agencia = "+agencia);
		Agencia ag = new Agencia();
		ag.setId(agencia);
		return dao.findAllByAgencia(ag);
	}

}
