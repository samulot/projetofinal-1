package br.com.marcorp.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.marcorp.projetofinal.dao.AgenciaDAO;
import br.com.marcorp.projetofinal.model.Agencia;

@RestController
public class AgenciaController {

	@Autowired
	AgenciaDAO dao;
	
	@GetMapping("/agencias")
	public ArrayList<Agencia> getAll(){
		ArrayList<Agencia> lista;
		lista = (ArrayList<Agencia>)dao.findAll();
		return lista;
	}

	/*
	@GetMapping("/agencias/{id}")
	public ResponseEntity<Agencia> getAgenciaPeloId(@PathVariable int id) {
		Agencia resultado = dao.findById(id).orElse(null);
		if(resultado != null) {                    // a Agencia existe
			return ResponseEntity.ok(resultado);
		}
		else {
			return ResponseEntity.status(404).build();
		}
	}
	*/
	
}
