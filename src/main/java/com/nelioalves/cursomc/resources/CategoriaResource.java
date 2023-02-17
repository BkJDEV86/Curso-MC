package com.nelioalves.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.services.CategoriaService;

// Controlador que chama o serviço que chama o repositorio
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	// Abaixo temos o id da url que irá para a variavél através do @PathVariable
	// O responseEntity encapsula/ armazena varias informações http para um serviço Rest
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		
		Categoria obj = service.find(id);
		
		// Resposta saindo como ok tendo o corpo como obj.
		return ResponseEntity.ok().body(obj);
	}

}
