package exercicios;

public class Exerc7 {

	public static void main(String[] args) {
		
		//Exerc�cio 7:  Escreva um programa que exiba todos os n�meros de 1 a 100 e a cada
		//				n�mero que for m�ltiplo de 10, exiba a mensagem �M�LTIPLO DE 10�.
		
	for (int x = 1; x <= 100; x++) {
		
		if (x % 10 == 0) {
			System.out.print("\n" + "O N�MERO " + x + " � M�LTIPLO DE 10" + "\n" + "\n");
		}
		else {
			System.out.print("N�MERO " + x + "\n");
		}
	}

	}

}
