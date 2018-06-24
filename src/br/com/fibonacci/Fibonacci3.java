package br.com.fibonacci;

public class Fibonacci3 {

	public static void main(String[] args) {
		
		/**
		 * Sequência de Fibonacci com 3 variáveis
		 */
		
		int a = 0;
		int b = 1;
		int auxiliar;
		
		for(int i = 0; i < 15; i++) {
			System.out.println(a); // 1 1 2 3...
			auxiliar = a;
			a += b;
			b = auxiliar;
		}
		
	}
	
}
