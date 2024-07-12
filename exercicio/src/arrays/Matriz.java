package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número de alunos na turma: ");
		int numAlunos = scan.nextInt();

		System.out.print("\nQuantas vezes são lançadas notas finais?: ");
		int numNotas = scan.nextInt();
		
		double[][] turma = new double[numAlunos][numNotas];
		double somatorioNotas = 0;
		
		for (int i = 0; i < numAlunos; i++) {
			System.out.println("\nNotas do aluno " + (i + 1));
			
			for (int j = 0; j < numNotas; j++) {
				System.out.print("Nota " + (j + 1) + ": ");
				double nota = scan.nextDouble();
				turma[i][j] = nota;
				somatorioNotas += nota;
			}
		}

		// Percorre cada aluno na turma
		for (int i = 0; i < turma.length; i++) {
			System.out.println("\n\nMédia das notas dos alunos:");
			double[] notas = turma[i];

			double somatorio = 0;
			// Percorre cada nota de um aluno
			for (double nota: notas) {
				somatorio += nota;
			}
			System.out.println("Aluno " + (i + 1) + ", média: "
					+ somatorio/notas.length);
		}

		double media_turma = somatorioNotas / (numAlunos * numNotas);
		
		System.out.println("\nMédia de notas da turma: " + media_turma);
		
		scan.close();
	}
}
