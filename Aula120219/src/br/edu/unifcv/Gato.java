package br.edu.unifcv;

public class Gato extends Animal {
	
	public void miar() {
		System.out.println("Estou miando");
	}

	@Override
	public String toString() {
		return "Gato [getNome()=" + getNome() + ", getIdade()=" + getIdade() + "]";
	}
	
	

}
