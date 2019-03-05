package br.edu.unifcv;

public class Principal {

	public static void main(String[] args) {
			
		Conta conta = new Conta();
		conta.setTitular("André Luiz de Oliveira");
		conta.setAgencia("Banco Itaú");
		conta.setNumero(123456);
		conta.setDataAbertura("01/01/2018");
		conta.setSaldo(50.00);
		
		System.out.println("Nome da conta: " + conta.getTitular() + 
				           "\nAgencia: " + conta.getAgencia() +
			               "\nNumero: " + conta.getNumero() +
			               "\nData Abertura: " + conta.getDataAbertura() +
			               "\nSaldo atual sem rendimento: " + conta.getSaldo() + 
			           
			               "\nRendimento: "+ conta.calcularRendimento() );

		conta.sacar(10.00);
		
		System.out.println("\nSaldo atual sem rendimento: " + conta.getSaldo() );
		System.out.println("\n\nNovo Rendimento: " + conta.calcularRendimento());
		
	}

}
