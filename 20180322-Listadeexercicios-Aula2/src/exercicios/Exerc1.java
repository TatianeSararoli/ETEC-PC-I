package exercicios;

public class Exerc1 {

	public static void main(String[] args) {
		
		//Exercício 1:  Escreva um programa que exiba na tela em ordem crescente,
		//				apenas os números pares existentes de 11 a 250.
		
		for (int n = 11; n <= 250; n++) {
			
			int x = n % 2;
			
			if (x == 0) {
				System.out.println(n);
			}
		}

	}

}
