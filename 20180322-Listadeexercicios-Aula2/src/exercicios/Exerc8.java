package exercicios;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		
		//Exerc�cio 8:  Escreva um programa que calcule o fatorial de um n�mero informado pelo usu�rio. 
		//				Dica: O fatorial de um n�mero N � dado pela f�rmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N
		
		int numero;
		int fatorial = 1;
		
		Scanner fator = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para Calcular o Fatorial: ");
		numero = fator.nextInt();
		
		for (int n = 1; n <= numero; n++) {
			fatorial = fatorial * n;
		}
		
		System.out.println ("O Fatorial do n�mero " + numero + " � " + fatorial + ".");
	}

}
