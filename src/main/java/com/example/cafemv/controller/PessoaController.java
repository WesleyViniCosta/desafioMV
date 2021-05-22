package com.example.cafemv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cafemv.model.Pessoa;
import com.example.cafemv.repository.PessoaRepository;

@CrossOrigin(origins = "*")
@RestController
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoa")
	public List<Pessoa> getAllPessoas(){
		return pessoaRepository.findAll();
	}
	
	@GetMapping("/pessoa/{id}")
	public Pessoa getPessoaById(@PathVariable Long id){
		return pessoaRepository.findById(id).get();
	}
	
	@PostMapping("/pessoa")
	public Pessoa savePessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@DeleteMapping("/pessoa/{id}")
	public void deletePessoa(@PathVariable Long id) {
		pessoaRepository.deleteById(id);
	}

}
