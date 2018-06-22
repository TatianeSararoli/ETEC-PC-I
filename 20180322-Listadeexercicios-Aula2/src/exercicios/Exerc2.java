package exercicios;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		//Exercício 2:  Escreva um programa que exiba na tela em ordem decrescente,
		//				apenas os números ímpares existentes entre dois números
		//				digitados pelo usuário (inclusive eles).
		
		int n1;
		int n2;
		int nmenor;
		int nmaior;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.print("Digite o 1º Número: ");
		n1 = numero.nextInt();
		
		System.out.print("Digite o 2º Número: ");
		n2 = numero.nextInt();
		
		if(n1 <= n2) {
			nmenor = n1;
			nmaior = n2;
		}
		else {
			nmenor = n2;
			nmaior = n1;
		}
		
		System.out.println ("O Menor Número é " + nmenor + " e o Maior Número é " + nmaior + ".");
		
		for (int x = nmaior; x >= nmenor; x--) {
			
			int numimp = x % 2;
			
			if (numimp != 0) {
				System.out.println (x);
			}
		}

	}

}
