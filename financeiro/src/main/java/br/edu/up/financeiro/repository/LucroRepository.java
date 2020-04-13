package br.edu.up.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.financeiro.entity.Lucro;

public interface LucroRepository extends JpaRepository<Lucro, Integer> {
}