package br.edu.up.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.up.financeiro.entity.Lucro;

public interface LucroRepository extends JpaRepository<Lucro, Integer> {
	@Query(value= "SELECT sum(valor) FROM lucro WHERE valor=?", nativeQuery = true)
	Lucro getSomaLucro(float lucro);
}