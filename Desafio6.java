package desafio6;

import java.util.Scanner;

public class Desafio6 {

	
	public static void main(String[] args) {
		
		imprimirMaiorPalavra();
	}
	/**
	 * Desafio 06 - Maior Palavra
	 * Método imprimirMaiorPalavra()
	 */
	private static void imprimirMaiorPalavra() {
		
		System.out.println("Digite uma frase qualquer.");
		Scanner leTeclado = new Scanner (System.in);
		String frase = leTeclado.nextLine();
			
		int iMaior = 0;
		int iMenor = 0;
		
		String quebra[] = frase.split(" ");
		
		for ( int i = 0 ; i < quebra.length ; i++ ) {  
		     if ( quebra[i].length() < quebra[iMenor].length() ) {  
		        iMenor = i;  
		     }  
		     if ( quebra[i].length() > quebra[iMaior].length() ) {  
		        iMaior = i;  
		     }  
		
		}
		System.out.println("Quantidade de palavras = " + quebra.length);
		System.out.println("Maior palavra = " + quebra[iMaior]);
	}
}


