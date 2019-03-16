package br.edu.unifcv.model;

public abstract class Banco {

	private String nome;
	private Integer numero;
	private String agencia;
	private String dataAbertura;
	private Double saldo;

	public Banco(Double saldo) {
		this.setSaldo(saldo);
	}

	public Double getSaldo() {
		return saldo;
	}

	private void setSaldo(Double saldo) {
		this.saldo = saldo < 0 ? 0 : saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public void depositar(Double valor) {
		System.out.println("Meu saldo atual : " + saldo);
		this.saldo = this.saldo + valor;
		/*
		 * if (isValorPositivo(valor)) { this.setSaldo(this.getSaldo() + valor); } else
		 * { System.err.println("Valor negativo"); }
		 */

	};

	private Boolean isPodeSacar(Double valor) {
		return isValorPositivo(valor) && 
				isTemSaldo(valor) && 
				isSaldoMenosRetiradaMaiorQueZero(valor);
	}

	private Boolean isValorPositivo(Double valor) {
		return valor >= 0;
	}

	public void sacar(Double valor) {
		System.out.println("Meu saldo atual : " + saldo);

		/*
		 * if (this.saldo > 0 && (this.saldo - valor >= 0)) { this.saldo = this.saldo -
		 * valor; } else { System.out.println("Sem saldo"); }
		 */

		if (isPodeSacar(valor)) {
			Double a = this.getSaldo() - valor;
			this.saldo = this.getSaldo() - valor;
		} else {
			System.err.println("Você não tem saldo o sufuciente");
			//System.exit(0);
		}

	}

	protected abstract Boolean isTemSaldo(Double valor);

	protected abstract Boolean isSaldoMenosRetiradaMaiorQueZero(Double valor);

}
