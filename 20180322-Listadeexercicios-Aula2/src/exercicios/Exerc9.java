package exercicios;

import java.util.Scanner;

public class Exerc9 {

	public static void main(String[] args) {
		
		//Exerc�cio 9:  Escreva um programa que leia v�rios n�meros inteiros e ao final
		//				informe quantos n�meros pares, quantos n�meros �mpares, quantos
		//				n�meros positivos e quantos n�meros negativos foram digitados
		//				pelo usu�rio. O programa s� deve parar de rodar quando o usu�rio
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
			
			System.out.print("Quantos N�meros Inteiros pretende digitar? Resp.: ");
			quant = numero.nextInt();
			System.out.print("\n");
			
			for (int n = 1; n <= quant; n++) {
				
				System.out.print("Digite um N�mero Inteiro: ");
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
			
			System.out.println ("\n" + "A Quantidade de N�meros Pares acima � " + par + ".");
			System.out.println ("A Quantidade de N�meros �mpares acima � " + impar + ".");
			System.out.println ("A Quantidade de N�meros Positivos acima � " + positivo + ".");
			System.out.println ("A Quantidade de N�meros Negativos acima � " + negativo + ".");
			
			System.out.print("\n" + "Deseja encerrar o programa?" + "\n");
			System.out.print("\n" + "S para Sim e N para N�o. Resposta: ");
			resp = resposta.next();
			
			System.out.print("\n");
		} while (resp == "N" || resp == "n");		
	}

}
