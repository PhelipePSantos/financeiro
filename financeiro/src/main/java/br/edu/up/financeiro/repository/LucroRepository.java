package br.edu.up.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import br.edu.up.financeiro.entity.Lucro;

public interface LucroRepository extends JpaRepository<Lucro, Integer> {
	@Query(value ="SELECT * FROM lucro WHERE setor =?1", nativeQuery = true)	
	Lucro getLucroBySetor(String setor);
	
}