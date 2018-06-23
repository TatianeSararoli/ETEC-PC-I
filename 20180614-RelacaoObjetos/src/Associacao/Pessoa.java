package Associacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pessoa {
	
	private String nome;
	private Date dtNasc;
	
	private List <Dependente> dependentes = new ArrayList <Dependente> (0);

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	
}
