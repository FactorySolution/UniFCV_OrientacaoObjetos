package br.edu.unifcv.model;

public class PessoaJuridica extends Pessoa {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public boolean isCnpjValido() {
		return isCpfCnpjValido(this.cnpj);
	}

}
