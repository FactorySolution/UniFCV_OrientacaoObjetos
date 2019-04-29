
public class Revisao03 {

	/*
	 * Incrementar uma sequencia de numeros
	 */
	public void IncrementarNumeroUsandoFor(int valor) {
		for (int i = 1; i <= valor; i++) {
			System.out.println(i);

		}
	}

	public void IncrementarNumeroUsandoWhile(int valor) {
		int i = 1;
		while (i <= valor) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		Revisao03 r3 = new Revisao03();
		r3.IncrementarNumeroUsandoFor(10);
	}

}
