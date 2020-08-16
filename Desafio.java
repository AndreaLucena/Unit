package desafio;

public class Desafio {

	public static void main(String[] args) {
		
			criarTabuleiro(1);
	}
	/**
	 * Desafio 01 - Rainha e o Monge
	 * Método criarTabuleiro()
	 */
	private static void criarTabuleiro(int i) {
		double [] x = new double [64];
		double casas = i;
		
		for (int j = 0; j <= 63; j++){
			x[j] = casas;
			casas = (2 * casas);
	}
		
		for (int j = 0; j <= 63; j++){
			System.out.println("Casa: " + (j+1) + "- Quant. " + x[j]);

		}
		
		
		
	}

}
