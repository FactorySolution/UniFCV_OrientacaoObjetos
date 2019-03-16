package br.edu.unifcv.model;

public class ContaCorrente extends Banco {

	public ContaCorrente(Double saldo) {
		super(saldo);
	}

	@Override
	protected Boolean isTemSaldo(Double valor) {
		return true;
	}

	@Override
	protected Boolean isSaldoMenosRetiradaMaiorQueZero(Double valor) {
		return true;
	}

}
