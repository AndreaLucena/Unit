package desafio2;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		calcularValorA();
	}
	/**
	 * Desafio 02 - Sequência 1
	 * Método calcularValorA()
	 */
	private static void calcularValorA() {
		
		System.out.println("Digite um número");
		Scanner leTeclado = new Scanner (System.in);
		double n = leTeclado.nextDouble();
		
		double a = 0;	
		
		for (int i = 0; i <= n; i++){
				a += ((n-i)/(i+1));
								
			}
		System.out.println("Para o valor de N igual a " + n + ", o valor de A será igual a: " + a);
		}
	}


