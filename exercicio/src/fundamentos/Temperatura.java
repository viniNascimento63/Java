package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		final double FATOR = 5.0/9.0;
		final double DIFERENCA = 32;
		double fahrenheit = 86;
		double celsius = (fahrenheit - DIFERENCA) * FATOR;
		
		System.out.println("A temperatura em °C é " + celsius + " °C.");
	}
}
