package exercicios;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		//Exercício 3:  Escreva um programa que exiba na tela a tabuada de um número
		//				que deverá ser informado pelo usuário (deverá ser usada qualquer
		//				estrutura de repetição). 
		//Exemplo: Digite um número: 4 
		//4 x 0 = 0 
		//4 x 1 = 4 
		//4 x 2 = 8 
		//4 x 3 = 12 
		//4 x 4 = 16 
		//4 x 5 = 20 
		//4 x 6 = 24 
		//4 x 7 = 28 
		//4 x 8 = 32 
		//4 x 9 = 36 
		//4 x 10 = 40
		
		int num;
		
		Scanner tabuada = new Scanner(System.in);
		
		System.out.print("Exibir a Tabuada do: ");
		num = tabuada.nextInt();
				
		for(int x = 0; x <= 10; x ++) {
			System.out.println (num + " x " + x + " = " + num * x);
		}

	}

}
