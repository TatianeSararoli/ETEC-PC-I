package exercicios;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		
		//Exerc�cio 4:  Escreva um programa que exiba na tela a quantidade de n�meros
		//				�mpares existentes entre dois n�meros que o usu�rio digitar
		//				(testar inclusive os n�meros digitados).
		
		int n1;
		int n2;
		int nmenor;
		int nmaior;
		int numimp = 0;
		
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
		
		for (int x = nmenor; x <= nmaior; x++) {
			
			if (x % 2 != 0) {
				numimp++;
			}
		}
		
		System.out.println ("A Quantidade de N�meros �mpares no intervalo acima � " + numimp + ".");		
	}

}
