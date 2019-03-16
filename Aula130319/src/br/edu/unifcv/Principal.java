package br.edu.unifcv;

import br.edu.unifcv.model.ContaCorrente;
import br.edu.unifcv.model.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(100.00);
		System.out.println(cc.getSaldo());

		cc.depositar(100.0);

		System.out.println(cc.getSaldo());

		cc.sacar(50.0);

		System.out.println(cc.getSaldo()); // 150.00

		cc.sacar(150.0); // vou zerar a conta

		System.out.println(cc.getSaldo());

		cc.sacar(50.0);

		cc.depositar(100.0);

		System.out.println(cc.getSaldo());

		cc.sacar(101.0); // deve dar um erro

		cc.sacar(100.0); // conta zerada 
		
		System.out.println(cc.getSaldo());

		cc.sacar(100.0);
		System.out.println(cc.getSaldo());

		// conta corrente ok

		ContaPoupanca cp = new ContaPoupanca(100.0, 10.0);
		System.out.println(cp.getSaldo());

		cp.sacar(50.0);

		System.out.println(cp.getSaldo());

		cp.depositar(50.0);

		System.out.println(cp.getSaldo());

		cp.sacar(100.0); // zerei a conta

		System.out.println(cp.getSaldo());

		cp.sacar(10.0);

		cp.depositar(100.0);

		System.out.println(cp.getSaldo());

		cp.sacar(101.0);

		cp.sacar(100.0);

		System.out.println(cp.getSaldo());

	}

}
