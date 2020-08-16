package desafio4;

import java.util.Scanner;

public class Desafio4 {

	
	public static void main(String[] args) {
		
		imprimirQuantPalavras();
	}
	/**
	 * Desafio 04 - Manipulando Texto II
	 * Método imprimirQuantPalavras()
	 */
	private static void imprimirQuantPalavras() {
				
		System.out.println("Digite uma frase qualquer.");
		Scanner leTeclado = new Scanner (System.in);
		String frase = leTeclado.nextLine();
		frase = frase.toUpperCase();
		
		int total = 0;
		
		for (int i=0; i< frase.length(); i++){
			char ch = frase.charAt(i);
			String frase2 = String.valueOf(ch);
			
			if (frase2.equals(" ")){
				total++;
			}
		}
		System.out.println("Total de plavras = " + (total + 1));
	}
}


