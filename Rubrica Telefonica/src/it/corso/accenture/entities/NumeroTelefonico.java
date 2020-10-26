package it.corso.accenture.entities;

public class NumeroTelefonico {
	
	//Attributes
	private String nome;
	private int numero;
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Constructor
	public NumeroTelefonico(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}
	
}
