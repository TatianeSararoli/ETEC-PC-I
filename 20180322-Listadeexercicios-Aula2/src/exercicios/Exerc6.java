package exercicios;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		
		//Exercício 6:  Escreva um programa que calcule e exiba a média de 10 notas
		//				digitadas pelo usuário. Considerar notas válidas, somente
		//				valores entre 0 (zero) e 10 (dez). Se o usuário digitar algum
		//				valor inválido, deverá ser exibida uma mensagem informando o ocorrido.
		
		double nota = 1;
		double media = 0;
		double notafinal = 0;
		
		Scanner notas = new Scanner(System.in);
		
		for (int n = 1; n <= 10; n++) {
			
			System.out.print("Digite a " + n + "ª Nota: ");
			nota = notas.nextDouble();
			
			while (nota < 0 || nota > 10) {
				System.out.print("Nota Inválida, digite novamente !!!" + "\n");
				System.out.print("Digite a " + n + "ª Nota: ");
				nota = notas.nextDouble();
			}
			media = media + nota;
		}
				
		notafinal = media / 10;
		System.out.println ("A Média das Notas digitadas acima é " + notafinal + ".");
	}

}
