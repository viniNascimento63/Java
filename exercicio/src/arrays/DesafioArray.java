package arrays;

import javax.swing.*;

public class DesafioArray {
    public static void main(String[] args) {
        int numNotas = Integer.parseInt(JOptionPane.
                showInputDialog("Digite o número de notas que deseja adicionar:"));

        double[] notas = new double[numNotas];

        for (int i = 0; i < numNotas; i++) {
            notas[i] = Double.parseDouble(JOptionPane.
                    showInputDialog("Digite a nota " + (i + 1) + ":"));
        }

        int i = 1;
        double somatorio = 0;
        for (double nota : notas) {
            System.out.println("Nota " + i + ": " + nota);
            somatorio += nota;
            i++;
        }

        System.out.println("Média: " + (somatorio / notas.length));
    }
}
