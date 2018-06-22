package exercicios;

public class Exerc7 {

	public static void main(String[] args) {
		
		//Exercício 7:  Escreva um programa que exiba todos os números de 1 a 100 e a cada
		//				número que for múltiplo de 10, exiba a mensagem “MÚLTIPLO DE 10”.
		
	for (int x = 1; x <= 100; x++) {
		
		if (x % 10 == 0) {
			System.out.print("\n" + "O NÚMERO " + x + " É MÚLTIPLO DE 10" + "\n" + "\n");
		}
		else {
			System.out.print("NÚMERO " + x + "\n");
		}
	}

	}

}
