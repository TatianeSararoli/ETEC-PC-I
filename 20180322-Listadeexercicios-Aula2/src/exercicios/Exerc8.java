package exercicios;

import java.util.Scanner;

public class Exerc8 {

	public static void main(String[] args) {
		
		//Exercício 8:  Escreva um programa que calcule o fatorial de um número informado pelo usuário. 
		//				Dica: O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N
		
		int numero;
		int fatorial = 1;
		
		Scanner fator = new Scanner(System.in);
		
		System.out.print("Digite um número para Calcular o Fatorial: ");
		numero = fator.nextInt();
		
		for (int n = 1; n <= numero; n++) {
			fatorial = fatorial * n;
		}
		
		System.out.println ("O Fatorial do número " + numero + " é " + fatorial + ".");
	}

}
