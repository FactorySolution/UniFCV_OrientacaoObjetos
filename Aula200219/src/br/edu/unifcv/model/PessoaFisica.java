package br.edu.unifcv.model;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	public PessoaFisica() {
		System.out.println("Estou no construtor de PEssoa fisica");
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
