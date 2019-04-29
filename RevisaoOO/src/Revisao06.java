
public class Revisao06 {

	public boolean isPalindromo(String valor) {

		String temp = "";

		for (int i = valor.length() - 1; i >= 0; i--) {
			temp += valor.charAt(i);
		}

		return valor.equalsIgnoreCase(temp);
	}

	public static void main(String[] args) {

		Revisao06 r6 = new Revisao06();
		if (r6.isPalindromo("Andre")) {
			System.out.println("é palindromo");
		} else {
			System.out.println("não é palindromo");
		}

	}

}
