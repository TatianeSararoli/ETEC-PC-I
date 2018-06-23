package Agregacao;

import java.util.ArrayList;

public class Time {
	
	private String nomeAtleta;
	private String tecnico;
	
	private ArrayList<Atleta> Atleta;
	
	public Time () {
		Atleta = new ArrayList<Atleta>();
		
	}
	
	public void add(Atleta umAtleta) {
		Atleta.add(umAtleta);
		
	}

}
