package br.edu.up.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.financeiro.entity.Balanco;



public interface BalancoRepository extends JpaRepository<Balanco, Integer> {
}