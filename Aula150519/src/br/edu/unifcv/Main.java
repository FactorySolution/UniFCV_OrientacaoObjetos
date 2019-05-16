package br.edu.unifcv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		percorrerLista();
		// PercorrerLista2();
	}

	public static void percorrerLista() {
		List<String> lista = new ArrayList<>();

		lista.add("Andre");
		lista.add("asdasdasd");
		lista.add("13123");
		lista.add("adasd");
		lista.add("adasd");

		for (int i = lista.size() - 1; i >= 0; i--) {
			System.out.println(lista.get(i));
		}

		for (String string : lista) {
			System.out.println(string);
		}

		/*
		 * for (String a : lista) { System.out.println(a); }
		 */

	}

	public static void PercorrerLista2() {
		List<Pessoa> pessoa = new ArrayList<>();

		Pessoa p = new Pessoa();
		p.setNome("Andre");
		p.setSobreNome("Oliveira");

		pessoa.add(p);

		p = new Pessoa();
		p.setNome("Aline");
		p.setSobreNome("Vasques");

		pessoa.add(p);

		for (int i = 0; i < pessoa.size(); i++) {
			Pessoa p2 = pessoa.get(i);
			p2.getNome();
			p2.getSobreNome();
		}

		for (Pessoa p1 : pessoa) {
			System.out.println(p1.getNome());
			System.out.println(p1.getSobreNome());
		}

	}

}
