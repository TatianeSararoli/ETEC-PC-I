package Associacao;

import java.util.Date;

public class Dependente {
	
	private String nome;
	private Date dtnasc;
	private String grauParentesco;
	
	private Pessoa responsavel;

	public Pessoa getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Pessoa responsavel) {
		this.responsavel = responsavel;
	}
		
}
