package br.edu.up.financeiro.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="lucro")
public class Lucro implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "valor", nullable = false)
	private float valor;
	@Column(name = "setor", nullable = false)
	private float setor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public float getSetor() {
		return setor;
	}
	public void setSetor(float setor) {
		this.setor = setor;
	}
	
	
	
}
