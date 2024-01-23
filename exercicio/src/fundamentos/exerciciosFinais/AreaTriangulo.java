package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("### ÁREA DO TRIÂNGULO ###");
		
		System.out.print("\nInforme a base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.print("Informe a altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double area = base * altura / 2;
		System.out.print("\nA área do triângulo é igual a "
				+ area 
				+ ".");
		
		entrada.close();
	}
}
