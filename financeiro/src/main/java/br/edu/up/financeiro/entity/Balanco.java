package br.edu.up.financeiro.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="balanco")
public class Balanco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "valorTotal", nullable = false)
	private float valorTotal;
	@Column(name = "valorSetor", nullable = false)
	private float valorSetor;
	@ManyToOne(cascade = CascadeType.ALL)
	private Despesa despesa;
	@ManyToOne(cascade = CascadeType.ALL)
	private Lucro lucro;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	public float getValorSetor() {
		return valorSetor;
	}
	public void setValorSetor(float valorSetor) {
		this.valorSetor = valorSetor;
	}
	public Despesa getDespesa() {
		return despesa;
	}
	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}
	public Lucro getLucro() {
		return lucro;
	}
	public void setLucro(Lucro lucro) {
		this.lucro = lucro;
	}
	
	
	
	
}