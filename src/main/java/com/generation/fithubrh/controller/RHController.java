package com.generation.fithubrh.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.fithubrh.model.RH;
import com.generation.fithubrh.repository.RHRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/fithubrh")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RHController {
	
	@Autowired
	private RHRepository rhRepository;
	
	//MÉTODOS GET
	//1. LISTAR TODOS OS COLABORADORES
	@GetMapping
	public ResponseEntity<List<RH>> getAll(){
		return ResponseEntity.ok(rhRepository.findAll());
			
	}

	//2. CONSULTA POR ID
	@GetMapping("/{id}")
	public ResponseEntity<RH> getById(@PathVariable Long id){
		return rhRepository.findById(id)
				.map(resposta  -> ResponseEntity.ok(resposta)) 
				.orElse(ResponseEntity.notFound().build()); 
	}
		
	//3. PESQUISA POR EMAIL
	@GetMapping("/email/{email}")
		public ResponseEntity<List<RH>> getAllByEmail(@PathVariable String email){
			return ResponseEntity.ok(rhRepository.findAllByEmailContainingIgnoreCase(email));
			
	}
	
	//MÉTODO POST
	//CADASTRAR COLABORADOR
	@PostMapping
		public ResponseEntity<RH> post(@Valid @RequestBody RH rh){ 
			return ResponseEntity.status(HttpStatus.CREATED).body(rhRepository.save(rh));
				
	}
		
		
	//MÉTODO PUT
	//ATUALIZAR COLABORADOR
	@PutMapping
		public ResponseEntity<RH> put(@Valid @RequestBody RH rh){ 
				
			if(rhRepository.existsById(rh.getId()))
				return ResponseEntity.ok(rhRepository.save(rh));
				
				return ResponseEntity.notFound().build();
	}
		
		
	//MÉTODO DELETE
	//DELETAR COLABORADOR
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id){
				
		Optional<RH> rh = rhRepository.findById(id);
				
		if(rh.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
				
		rhRepository.deleteById(id);
					
	}

	
}
