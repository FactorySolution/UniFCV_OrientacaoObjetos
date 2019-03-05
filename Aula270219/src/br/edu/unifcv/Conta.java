package br.edu.unifcv;

public class Conta {

	private String nomeTitular;
	private Integer numero;
	private String agencia;
	private Double saldo = 0.0;
	private String dataAbertura;

	public Conta() {
	}

	public Conta(String nomeTitular, Integer numero, String agencia, Double saldo, String dataAbertura) {
		this.nomeTitular = nomeTitular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}

	public String getTitular() {
		return nomeTitular;
	}

	public void setTitular(String titular) {
		this.nomeTitular = titular;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void sacar(Double valor) {
		this.saldo -= valor;
	}

	public void depositar(Double valor) {
		this.saldo += valor;
	}

	public Double calcularRendimento() {
		Double rendimento = this.saldo * 0.5;
		return this.saldo + rendimento;
	}

}
