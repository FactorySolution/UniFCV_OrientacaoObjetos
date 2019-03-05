package br.edu.unifcv;

public class Aluno extends Base {
	private String nome;
	private String sobreNome;
	private Integer idade;
	
	@Override
	public void Salvar() {
		System.out.println("Estou vindo da classe Aluno");
	}
	
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(Integer idade) {
		this.idade = idade;
	}
	
	public Aluno(String nome, String sobreNome) {
		this.nome = nome;
		this.sobreNome = sobreNome;
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	
}




