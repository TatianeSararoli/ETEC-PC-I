package exercicios;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		
		//Exercício 4:  Escreva um programa que exiba na tela a quantidade de números
		//				ímpares existentes entre dois números que o usuário digitar
		//				(testar inclusive os números digitados).
		
		int n1;
		int n2;
		int nmenor;
		int nmaior;
		int numimp = 0;
		
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
		
		for (int x = nmenor; x <= nmaior; x++) {
			
			if (x % 2 != 0) {
				numimp++;
			}
		}
		
		System.out.println ("A Quantidade de Números Ímpares no intervalo acima é " + numimp + ".");		
	}

}
