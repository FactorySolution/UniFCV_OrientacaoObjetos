package br.edu.unifcv;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Aluno aluno = new Aluno(34);
		//aluno.Salvar();
		//aluno.Teste2();
		
		List  a  = new ArrayList();
		a.add(aluno);
		
		System.out.println(((Aluno) a.get(0)).getIdade());
;		
	
		
		//float a = (Integer) 10.5f;
		
		//aluno.Teste2();
		
		//Base base = new Base();
		//base.Teste();
		//base.Teste2();
	}

}
