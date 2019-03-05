package br.edu.unifcv.model;

public class Pessoa extends Base {

	private String nome;
	private String sobreNome;
	
	private Endereco endereco;
	
	public Pessoa() {
		System.out.println("Estou no construtor de Pessoa");
		this.endereco = new Endereco();
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
}
