package exercicios;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		//Exerc�cio 2:  Escreva um programa que exiba na tela em ordem decrescente,
		//				apenas os n�meros �mpares existentes entre dois n�meros
		//				digitados pelo usu�rio (inclusive eles).
		
		int n1;
		int n2;
		int nmenor;
		int nmaior;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.print("Digite o 1� N�mero: ");
		n1 = numero.nextInt();
		
		System.out.print("Digite o 2� N�mero: ");
		n2 = numero.nextInt();
		
		if(n1 <= n2) {
			nmenor = n1;
			nmaior = n2;
		}
		else {
			nmenor = n2;
			nmaior = n1;
		}
		
		System.out.println ("O Menor N�mero � " + nmenor + " e o Maior N�mero � " + nmaior + ".");
		
		for (int x = nmaior; x >= nmenor; x--) {
			
			int numimp = x % 2;
			
			if (numimp != 0) {
				System.out.println (x);
			}
		}

	}

}
