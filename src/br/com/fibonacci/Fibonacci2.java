package br.com.fibonacci;

import java.util.Scanner;

public class Fibonacci2 {

	public static void main(String[] args) {

		/**
		 * Sequência de Fibonacci inserindo uma entrada de dado
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o número:");
		int numero = scan.nextInt();
		scan.close(); //sempre fechar a inserção de dados
		
		
		for(int a = 0, b = 1; a <= numero; b += a, a = b -a ) {
			System.out.println(a + " ");
		}
		
	}
	
}
