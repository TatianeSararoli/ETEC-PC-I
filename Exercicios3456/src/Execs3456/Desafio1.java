package Execs3456;

public class Desafio1 {

	public static void main(String[] args) {
		
		String declarar = "Curso de Java" + " - Exemplo String";
		String novastr = declarar;
				
		String [] palavras = novastr.split (" - ");
		System.out.println(palavras [1]);

	}

}
