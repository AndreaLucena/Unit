package desafio5;

import java.util.Scanner;

public class Desafio5 {
	
	/**
	 * Desafio 05 - Fibonacci
	 * Método fibo(int n)
	 */
	static long fibo(int n){
		return (n < 2)? n: fibo (n-1) + fibo(n-2);
	}
	
	public static int main(String[] args) {
	
		System.out.println("Digite um número inteiro.");
		Scanner leTeclado = new Scanner (System.in);
		int numero = leTeclado.nextInt();
				
		if (numero < 2){
			return 0;
				
		}else{
			for (int i=0; i< numero; i++){
				System.out.println("("+i+"):" + Desafio5.fibo(i)+ "\t");
			}				
		}
		return numero;
	}
}



