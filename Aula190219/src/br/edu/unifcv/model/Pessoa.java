package br.edu.unifcv.model;

public abstract class Pessoa {
	
	private String nome = "";
	private String sobreNome = "";
	private Integer idade = -1;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return this.sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public boolean isDadosValidos() {
		return !this.nome.trim().isEmpty() && 
				!this.sobreNome.trim().isEmpty() && 
				this.idade >= 0;
	}
	
	protected boolean isCpfCnpjValido(String dados) {
		return true;
	}
	
	

}



