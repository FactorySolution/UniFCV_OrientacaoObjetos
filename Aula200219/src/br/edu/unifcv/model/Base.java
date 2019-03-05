package br.edu.unifcv.model;

public class Base {

	private Integer id;
	
	public Base() {
		System.out.println("Estou no construtor de BASE");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
