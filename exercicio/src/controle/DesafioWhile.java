package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double nota;
		double somatorioNotas = 0;
		int totalAlunos = 0;
		
		do {
			System.out.print("Digite a nota (ou -1 para sair): ");
			nota = scanner.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				somatorioNotas += nota;
				totalAlunos++;
			} else if(nota != -1){
				System.out.println("Valor inválido!");
			}
			
		} while(nota != -1);
		
		double media = somatorioNotas/totalAlunos;
		
		System.out.printf("\n# Somatório das notas: %.2f"
				+ "\n# Total de alunos: %d"
				+ "\n# Média: %.1f", somatorioNotas, totalAlunos, media);
		
		System.out.println("\nPrograma encerrado!");
				
		scanner.close();
	}
}
