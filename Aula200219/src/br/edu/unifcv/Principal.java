package br.edu.unifcv;

import br.edu.unifcv.model.PessoaFisica;

public class Principal {

	public static void main(String[] args) {
         PessoaFisica pf = new PessoaFisica();
         pf.getEndereco().setEndereco("RUA");
         
         System.out.println(pf.getEndereco().getEndereco());
	}

}
