package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        // Declarando o array e seus valores de forma indireta
        double[] notasAlunoA = new double[3];

        // Valores inicializados por padrão para
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunoA));

        double totalNotas1 = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalNotas1 += notasAlunoA[i];
        }

        System.out.println("Média das notas: " + totalNotas1 / notasAlunoA.length);

        // Declarando o array e seus valores de forma direra
        double[] notasAlunoB = {7.8, 8.2, 8.7};

        double totalNotas2 = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalNotas2 += notasAlunoB[i];
        }

        System.out.println("Média das notas: " + totalNotas2 / notasAlunoB.length);
    }
}
