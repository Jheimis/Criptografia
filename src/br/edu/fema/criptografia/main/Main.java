package br.edu.fema.criptografia.main;

import br.edu.fema.criptografia.components.CriptografiaComponent;
import br.edu.fema.criptografia.vo.AlunoVO;

public class Main {
	public static void main(String[] args) {

		AlunoVO aluno = new AlunoVO();
		aluno.setNome("texto para criptografia");
		aluno.setEmail("texto para criptografia");
		aluno.setRa("Texto para criptografia");

		try {
			CriptografiaComponent.isValid(aluno);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
