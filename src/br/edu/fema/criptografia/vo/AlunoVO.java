package br.edu.fema.criptografia.vo;

import br.edu.fema.criptografia.annotations.Criptografia;

public class AlunoVO {
	 
	@Criptografia
	private String nome;
	
	@Criptografia
	private String email;
	
	@Criptografia
	private String ra;
	

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
