package br.com.fibonacci;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {

		/**
		 * Sequ�ncia de Fibonacci inserindo uma entrada de dado
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o n�mero:");
		int numero = scan.nextInt();
		scan.close(); //sempre fechar a inser��o de dados
		
		
		for(int a = 0, b = 1; a <= numero; b += a, a = b -a ) {
			System.out.println(a + " ");
		}
		
	}
	
}
