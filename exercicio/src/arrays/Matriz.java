package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos na turma: ");
        int num_alunos = scan.nextInt();

        double[][] turma = new double[num_alunos][];

        for (int i = 0; i < num_alunos; i++) {
            System.out.print("\nDigite quantas notas tem o aluno "
                    + (i + i) + ":");

            int num_notas = scan.nextInt();

            for (int j = 0; j < num_notas; j++) {
                System.out.print("\nDigite a nota " + (j + 1) + ": ");
                double nota = scan.nextDouble();
                double[] nota_aluno = new double[]{nota};
                turma[i][j] = nota_aluno;
            }
        }


        scan.close();
    }
}
