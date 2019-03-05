package br.edu.unifcv.model;

public class PessoaFisica extends Pessoa {

	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public boolean isCpfValido() {
		return super.isCpfCnpjValido(this.cpf);
	}
	
	
	
	
	
	
	
	
}
