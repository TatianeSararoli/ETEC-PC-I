package exercicios;

import java.util.Scanner;

public class Exerc6 {

	public static void main(String[] args) {
		
		//Exerc�cio 6:  Escreva um programa que calcule e exiba a m�dia de 10 notas
		//				digitadas pelo usu�rio. Considerar notas v�lidas, somente
		//				valores entre 0 (zero) e 10 (dez). Se o usu�rio digitar algum
		//				valor inv�lido, dever� ser exibida uma mensagem informando o ocorrido.
		
		double nota = 1;
		double media = 0;
		double notafinal = 0;
		
		Scanner notas = new Scanner(System.in);
		
		for (int n = 1; n <= 10; n++) {
			
			System.out.print("Digite a " + n + "� Nota: ");
			nota = notas.nextDouble();
			
			while (nota < 0 || nota > 10) {
				System.out.print("Nota Inv�lida, digite novamente !!!" + "\n");
				System.out.print("Digite a " + n + "� Nota: ");
				nota = notas.nextDouble();
			}
			media = media + nota;
		}
				
		notafinal = media / 10;
		System.out.println ("A M�dia das Notas digitadas acima � " + notafinal + ".");
	}

}
