
public class Revisao02 {

	/*
	 * M�todo para comparar dois n�meros
	 */
	public void CompararDoisNumeroSemRetorno(int A, int B) {
		if (A > B) {
			System.out.println("A � maior que B");
		} else if (A < B) {
			System.out.println("B � maior que A");
		} else {
			System.out.println("Os valores s�o iguais");
		}
	}

	/*
	 * M�todo para comparar dois n�meros com retorno
	 */
	public String CompararDoisNumeroComRetorno(int A, int B) {
		if (A > B) {
			return "A � maior que B";
		} else if (A < B) {
			return "B � maior que A";
		} else {
			return "Os valores s�o iguais";
		}
	}

	public static void main(String[] args) {
		Revisao02 r2 = new Revisao02();
		String retorno = r2.CompararDoisNumeroComRetorno(2, 3);
		System.out.println(retorno);
	}

}
