package controle.exercíciosFinais;

import java.util.Scanner;

public class Ex003 {
	
	/**
	 * 3. Criar um programa que receba duas notas parciais, calcular a média
	 * final. Se a nota do aluno for maior ou igual a 7.0 imprime no console
	 * "Aprovado", se a nota for menor que 7.0 e maior do que 4.0 imprime no console
	 * "Recuperação", caso contrário imprime no console "Reprovado".
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble(); 
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if (media >= 7) {
			System.out.printf("Média %.1f: APROVADO!", media);
		} else if (media >= 4) {
			System.out.printf("Média %.1f: RECUPERAÇÃO!", media);
		} else {
			System.out.printf("Média %.1f: REPROVADO!", media);
		}
		scanner.close();
	}
}
