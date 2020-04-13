package br.edu.up.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.financeiro.entity.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, Integer> {
}