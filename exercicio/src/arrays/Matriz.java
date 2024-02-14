package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o número de alunos na turma: ");
		int numAlunos = scan.nextInt();

		System.out.print("\nDigite o número de notas de cada aluno: ");
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

		for (int i = 0; i < turma.length; i++) {
			System.out.println("\n\nMédia das notas dos alunos:");
			double nota = 0;
			for (int j = 0; j < turma[i].length; j++) {
				nota += turma[i][j];
			}
			double media = nota / turma[i].length;
			System.out.println("Aluno " + (i + 1) + ", média: " + media);
		}

		double mediaNotas = somatorioNotas / (numAlunos * numNotas);
		
		System.out.println("\nMédia de notas da turma: " + mediaNotas);
		
		scan.close();
	}
}
