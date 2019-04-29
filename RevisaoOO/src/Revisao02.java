
public class Revisao02 {

	/*
	 * Método para comparar dois números
	 */
	public void CompararDoisNumeroSemRetorno(int A, int B) {
		if (A > B) {
			System.out.println("A é maior que B");
		} else if (A < B) {
			System.out.println("B é maior que A");
		} else {
			System.out.println("Os valores são iguais");
		}
	}

	/*
	 * Método para comparar dois números com retorno
	 */
	public String CompararDoisNumeroComRetorno(int A, int B) {
		if (A > B) {
			return "A é maior que B";
		} else if (A < B) {
			return "B é maior que A";
		} else {
			return "Os valores são iguais";
		}
	}

	public static void main(String[] args) {
		Revisao02 r2 = new Revisao02();
		String retorno = r2.CompararDoisNumeroComRetorno(2, 3);
		System.out.println(retorno);
	}

}
