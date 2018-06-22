package exercicios;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		
		//Exercício 5:  Escreva um programa que leia 15 números inteiros e exiba na
		//				tela ao final, o maior número que foi digitado pelo usuário.
		
		int dignum = 0;
		int nmaior = 0;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.print("Digite o " + 1 + "º Número: ");
		dignum = numero.nextInt();
		
		for (int x = 2; x < 16; x++) {
			
			System.out.print("Digite o " + x + "º Número: ");
			dignum = numero.nextInt();
			
			if (dignum > nmaior) {
				nmaior = dignum;	
			}
		}
		
		System.out.println ("O Maior Número digitado acima é " + nmaior + ".");
	}

}
