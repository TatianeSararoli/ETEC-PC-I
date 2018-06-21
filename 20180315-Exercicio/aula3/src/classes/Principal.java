package classes;

import classes.Empregado;

public class Principal {
	public static String nome = "Tati";  
    	public static void main (String args[]){
    		Empregado p = new Empregado(nome);
       
    		p.exibirDados();
       
    		System.out.println("");
        
    		p.atualizarDados();
        
    		System.out.println("");
        
    		p.exibirDados();
      
    	}
}
