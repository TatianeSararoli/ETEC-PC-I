package exercicios;

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		
		//Exercício 9:  Escreva um programa que leia vários números inteiros e ao final
		//				informe quantos números pares, quantos números ímpares, quantos
		//				números positivos e quantos números negativos foram digitados
		//				pelo usuário. O programa só deve parar de rodar quando o usuário
		//				responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
		
		int quant = 0;
		int num = 0;
		int par = 0;
		int impar = 0;
		int positivo = 0;
		int negativo = 0;
		String resp = null;
		
		do {
			Scanner numero = new Scanner(System.in);
			
			System.out.print("Quantos Números Inteiros pretende digitar? Resp.: ");
			quant = numero.nextInt();
			System.out.print("\n");
			
			for (int n = 1; n <= quant; n++) {
				
				System.out.print("Digite um Número Inteiro: ");
				num = numero.nextInt();
				
				if (num % 2 == 0) {
					par = par + 1;
				}
				else {
					impar = impar + 1;
				}
				if (num > 0) {
					positivo = positivo + 1;
				}
				else if (num % 2 == 0) {
					negativo = negativo + 1;
				}
				else {
					impar = impar + 1;
				}
			}
			Scanner resposta = new Scanner(System.in);
			
			System.out.println ("\n" + "A Quantidade de Números Pares acima é " + par + ".");
			System.out.println ("A Quantidade de Números Ímpares acima é " + impar + ".");
			System.out.println ("A Quantidade de Números Positivos acima é " + positivo + ".");
			System.out.println ("A Quantidade de Números Negativos acima é " + negativo + ".");
			
			System.out.print("\n" + "Deseja encerrar o programa?" + "\n");
			System.out.print("\n" + "S para Sim e N para Não. Resposta: ");
			resp = resposta.next();
			
			System.out.print("\n");
		} while (resp == "N" || resp == "n");		
	}

}
