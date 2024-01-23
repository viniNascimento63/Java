package controle.exercíciosFinais;

import java.util.Scanner;

public class Ex006 {

	public static void main(String[] args) {
		// Casting para número inteiro
		int num = (int) (Math.random() * 100);

		Scanner scan = new Scanner(System.in);

		for (int i = 10; i > 0; i--) {
			System.out.print("Chute um número de 0 a 100: ");
			int chute = scan.nextInt();

			if (chute >= 0 && chute <= 100) {

				if (chute == num) {
					System.out.println("Você acertou!");
					break;
				} else {
					System.out.println("\n# Tente novamente :(");
					System.out.println("# Tentativas restantes: " + (i - 1) + "\n");
					if (num > chute) {
						System.out.println("Chute mais alto!");
					} else {
						System.out.println("Chute mais baixo!");
					}
					continue;
				}
			} else {
				System.out.println("Número inválido!");
				i++;
			}
		}
		System.out.println("Fim!");
		scan.close();
	}
}
