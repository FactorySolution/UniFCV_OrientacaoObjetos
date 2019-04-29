
public class Revisao01 {

	/*
	 * Calcular a média de um aluno
	 */
	public void CalcularMediaSemRetorno(int A, int B, int C, int D) {
		double media = ((A + B + C + D) / 4);
		System.out.println("A Média do aluno é: " + media);
	}

	/*
	 * Calcular média de um aluno com retorno double
	 * 
	 */
	public double CalcularMediaComRetorno(int A, int B, int C, int D) {
		double media = ((A + B + C + D) / 4);
		return media;
	}

	public static void main(String[] args) {
		Revisao01 r1 = new Revisao01();
		System.out.println(r1.CalcularMediaComRetorno(5, 5, 5, 5));

	}

}
