package br.edu.unifcv;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

	public static void main(String[] args) {
		listaInversa();
	}

	public static void listaInversa() {

		List<String> lista = new ArrayList<>();

		lista.add("Andre");
		lista.add("Luiz");
		lista.add("Oliveira");
		lista.add("Aline");
		lista.add("Vasques");

		for (int i = lista.size() - 1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
	}
}
