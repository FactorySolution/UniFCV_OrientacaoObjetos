package br.edu.unifcv;

public abstract class Animal {

	private String nome;
	private Integer idade;
	
	public void ola() {
		System.out.println("Ola eu sou um animal");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void dormir() {
		System.out.println("Estou dormindo");
	}

}
