package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Escreva o dia da semana: ");
		String dia = scanner.next();

		if (dia.equalsIgnoreCase("Domingo")) {
			System.out.println("Domingo = 1");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println("Segunda = 2");
		} else if (dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Terca")) {
			System.out.println("Terça = 3");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Quarta = 4");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Quinta = 5");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Sexta = 6");
		} else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.println("Sábado = 7");
		} else {
			System.out.println("Dia inválido!");
		}

		scanner.close();
	}
}
