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
		
		double mediaNotas = somatorioNotas / (numAlunos * numNotas);
		
		System.out.println("\nMédia das notas: " + mediaNotas);
		
		scan.close();
	}
}
