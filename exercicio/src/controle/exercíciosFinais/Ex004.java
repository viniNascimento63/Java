package controle.exercíciosFinais;

import java.util.Scanner;

public class Ex004 {
	
	/**
	 * 4. Criar um programa que receba um número e diga se ele é um número primo.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = scanner.nextInt();
		
		if (num > 1) {
			for (int i = 2; i <= num; i++) {

				if (i == num) {
					System.out.printf("%d é número primo.", num);
				} else if (num % i == 0) {
					System.out.printf("%d não é número primo.", num);
					break;
				}
			}
		} else {
			System.out.println("Número inválido!");
		}

		scanner.close();
	}
}
