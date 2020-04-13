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

import br.edu.up.financeiro.entity.Despesa;
import br.edu.up.financeiro.repository.DespesaRepository;


@RestController
@RequestMapping("despesa")
public class DespesaController {
	@Autowired
	private DespesaRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Despesa> listAll(){
		Iterable<Despesa> list = repository.findAll();
		return list;
	}
	@GetMapping("/{id}")
	public @ResponseBody Despesa getById(@PathVariable Integer Id) {
		Despesa despesa = repository.getOne(Id);
		return despesa;
	}
	
	@PostMapping
	public Despesa add(@RequestBody @Valid Despesa despesa) {
		return repository.save(despesa);
	}
	
	public Despesa delete(@PathVariable Integer id) {
		Despesa despesa = repository.getOne(id);
		repository.delete(despesa);
		return despesa;
	}
}