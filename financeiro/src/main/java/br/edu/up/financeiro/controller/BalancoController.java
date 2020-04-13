package br.edu.up.financeiro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.financeiro.entity.Balanco;
import br.edu.up.financeiro.repository.BalancoRepository;


@RestController
@RequestMapping("balanco")
public class BalancoController {
	@Autowired
	private BalancoRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Balanco> listAll(){
		Iterable<Balanco> list = repository.findAll();
		return list;
	}
	@GetMapping("/{id}")
	public @ResponseBody Balanco getById(@PathVariable Integer Id) {
		Balanco balanco = repository.getOne(Id);
		return balanco;
	}
	
	@PostMapping
	public Balanco add(@RequestBody @Valid Balanco balanco) {
		return repository.save(balanco);
	}
	
	public Balanco delete(@PathVariable Integer id) {
		Balanco balanco = repository.getOne(id);
		repository.delete(balanco);
		return balanco;
	}
}
