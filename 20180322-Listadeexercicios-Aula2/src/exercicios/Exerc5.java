package exercicios;

import java.util.Scanner;

public class Exerc5 {

	public static void main(String[] args) {
		
		//Exerc�cio 5:  Escreva um programa que leia 15 n�meros inteiros e exiba na
		//				tela ao final, o maior n�mero que foi digitado pelo usu�rio.
		
		int dignum = 0;
		int nmaior = 0;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.print("Digite o " + 1 + "� N�mero: ");
		dignum = numero.nextInt();
		
		for (int x = 2; x < 16; x++) {
			
			System.out.print("Digite o " + x + "� N�mero: ");
			dignum = numero.nextInt();
			
			if (dignum > nmaior) {
				nmaior = dignum;	
			}
		}
		
		System.out.println ("O Maior N�mero digitado acima � " + nmaior + ".");
	}

}
