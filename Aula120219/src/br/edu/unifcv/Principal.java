package br.edu.unifcv;

public class Principal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Pluto");
		cachorro.setIdade(10);
		cachorro.setComprimentoPelo(8);
		cachorro.setCorDosOlhos("Verde");
		cachorro.setPeso(10);

		cachorro.dormir();
		cachorro.dormir();
		cachorro.dormir();
		cachorro.dormir();

		Cachorro cachorro2 = new Cachorro();

		cachorro2.setNome("Astrogildo");
		cachorro2.setIdade(5);
		cachorro2.setComprimentoPelo(3);
		cachorro2.setCorDosOlhos("Azul");
		cachorro2.setPeso(16);

		Gato gato = new Gato();
		gato.setNome("Bichano");
		gato.setIdade(1);

		cachorro.ola();

		cachorro.latir();
		gato.miar();

		Lebre lebre = new Lebre();

		lebre.setNome("Tião");
		lebre.setSexo("Masculino");

		System.out.println(cachorro.toString());
		System.out.println("Nome do cachorro: " + cachorro.getNome());

		System.out.println(cachorro2.toString());
		System.out.println("Nome do cachorro 2: " + cachorro2.getNome());

	}

}
