package desafio8;

import java.text.NumberFormat;
import java.util.Scanner;

public class Desafio8 {

	
	public static void main(String[] args) {
		
		imprimirValoresX();
	}
	/**
	 * Desafio 08 - Raízes de uma Equação de 2º Grau
	 * Método imprimirValoresX()
	 */
	private static void imprimirValoresX() {
			
		System.out.println("Digite o valor de 'a'");
		Scanner leTeclado = new Scanner (System.in);
		double a = leTeclado.nextDouble();
		System.out.println("Digite o valor de 'b'");
		Scanner leTeclado2 = new Scanner (System.in);
		double b = leTeclado2.nextDouble();
		System.out.println("Digite o valor de 'c'");
		Scanner leTeclado3 = new Scanner (System.in);
		double c = leTeclado3.nextDouble();
		
		double delta;
		delta = ((b * b) - (4 * a * c));
		double x1 = 0;
		double x2 = 0;
		
		if (delta >= 0){
			x1 = ((b - (Math.sqrt(delta)))/(2 * a));
			x2 = ((b + (Math.sqrt(delta)))/(2 * a));
			
			NumberFormat inteiro1 = NumberFormat.getInstance();
			NumberFormat inteiro2 = NumberFormat.getInstance();
					
			System.out.println("X1 = " + inteiro1.format(x1) + "; X2 = " + inteiro2.format(x2));
		}
		else{
			System.out.println("Indeterminadas");
		}
	}
}
