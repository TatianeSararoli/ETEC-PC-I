package exercicios;

public class Exerc1 {

	public static void main(String[] args) {
		
		//Exerc�cio 1:  Escreva um programa que exiba na tela em ordem crescente,
		//				apenas os n�meros pares existentes de 11 a 250.
		
		for (int n = 11; n <= 250; n++) {
			
			int x = n % 2;
			
			if (x == 0) {
				System.out.println(n);
			}
		}

	}

}
