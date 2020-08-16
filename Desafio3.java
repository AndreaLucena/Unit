package desafio3;

import java.util.Scanner;

public class Desafio3 {
	
	public static void main(String[] args) {
		
		imprimirQuantLetras();
	}
	/**
	 * Desafio 03 - Manipulando Texto I
	 * Método imprimirQuantLetras()
	 */
	private static void imprimirQuantLetras() {
		
		System.out.println("Digite uma frase qualquer.");
		Scanner leTeclado = new Scanner (System.in);
		String frase = leTeclado.nextLine();
		frase = frase.toUpperCase();
		
		int total = 0;
		
		for (int i=0; i< frase.length(); i++){
			char ch = frase.charAt(i);
			String frase2 = String.valueOf(ch);
						
			if (frase2.equals("A")){
				total++;
			}
		}
		System.out.println("Total de A = " + total);
	}
}


