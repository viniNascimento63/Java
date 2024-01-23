package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		int a1 = 6 * (3 + 2); // Resultado = 30
		int a2 = 3 * 2; // Resultado = 6
		
		int b1 = (1 - 5) * (2 - 7); // Resultado = 20
		int b2 = 2;

		int a = (int) Math.pow(a1, 2) / a2; // Resultado = 150
		int b = (int) Math.pow(b1 / b2, 2); // Resultado = 100
		int c = (int) Math.pow(a - b, 3); // Resultado = 125000
		int d = (int) Math.pow(10, 3); // Resultado = 1000
		
		int resultado = c / d;
		
		System.out.println("O resultado da expressão é igual a "
		+ resultado + ".");
	}
}
