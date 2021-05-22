package com.example.cafemv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	private String comida;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(Long id, String nome, String cpf, String comida) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.comida = comida;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	
}
