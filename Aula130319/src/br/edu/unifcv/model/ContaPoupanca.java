package br.edu.unifcv.model;

public class ContaPoupanca extends Banco {

	private Double percRendimento = 0.00;

	public void getSaldoMaisRendimento() {
		System.out.println(String.format("R$ %.2f", this.getRendimento()));
	}

	public ContaPoupanca(Double saldo, Double percRendimento) {
		super(saldo);
		this.percRendimento = percRendimento;
	}

	private Double getRendimento() {
		return super.getSaldo() + ((super.getSaldo() * this.percRendimento) / 100);
	}

	@Override
	public String toString() {
		return "ContaPoupanca [ saldo: R$ " + String.format("%.2f", super.getSaldo()) + ", perc. rendimento: "
				+ String.format("%.2f%%", percRendimento) + ", Nome: " + getNome() + ", Numero: " + getNumero()
				+ ", agencia: " + getAgencia() + ", data abertura: " + getDataAbertura() + " ]";
	}

	@Override
	protected Boolean isTemSaldo(Double valor) {
		return super.getSaldo() > 0;
	}

	@Override
	protected Boolean isSaldoMenosRetiradaMaiorQueZero(Double valor) {
		return (super.getSaldo() - valor) >= 0;
	}

}
