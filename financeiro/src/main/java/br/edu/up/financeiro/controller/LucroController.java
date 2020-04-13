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

import br.edu.up.financeiro.entity.Lucro;
import br.edu.up.financeiro.repository.LucroRepository;



@RestController
@RequestMapping("lucro")
public class LucroController {
	@Autowired
	private LucroRepository repository;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody Iterable<Lucro> listAll(){
		Iterable<Lucro> list = repository.findAll();
		return list;
	}
	@GetMapping("/{id}")
	public @ResponseBody Lucro getById(@PathVariable Integer Id) {
		Lucro lucro = repository.getOne(Id);
		return lucro;
	}
	
	@PostMapping
	public Lucro add(@RequestBody @Valid Lucro lucro) {
		return repository.save(lucro);
	}
	
	public Lucro delete(@PathVariable Integer id) {
		Lucro lucro = repository.getOne(id);
		repository.delete(lucro);
		return lucro;
	}
}