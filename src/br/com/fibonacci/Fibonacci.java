package br.com.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		
		/**
		 * 	Sequ�ncia de Fibonacci com duas vari�veis
		 */
		for(int a = 0, b =1; a <= 1000; b += a, a = b - a) {
			System.out.println(a + " ");
		}
				
	}
	
}
