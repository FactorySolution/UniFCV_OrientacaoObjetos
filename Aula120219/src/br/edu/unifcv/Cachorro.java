package br.edu.unifcv;

public class Cachorro extends Animal {

	private float comprimentoPelo;
	private String corDosOlhos;
	private float peso;

	public void latir() {
		System.out.println("Estou latindo");
	}

	public float getComprimentoPelo() {
		return comprimentoPelo;
	}

	public void setComprimentoPelo(float comprimentoPelo) {
		this.comprimentoPelo = comprimentoPelo;
	}

	public String getCorDosOlhos() {
		return corDosOlhos;
	}

	public void setCorDosOlhos(String corDosOlhos) {
		this.corDosOlhos = corDosOlhos;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Cachorro [comprimentoPelo=" + comprimentoPelo + ", corDosOlhos=" + corDosOlhos + ", peso=" + peso
				+ ", getNome()=" + getNome() + ", getIdade()=" + getIdade() + "]";
	}
	


}
