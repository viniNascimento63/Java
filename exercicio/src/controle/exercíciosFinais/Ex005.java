package controle.exercíciosFinais;

import java.util.Scanner;

public class Ex005 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int num = scanner.nextInt();

		if (num > 1) {
			int res = 0;
			for (int i = 2; i <= num; i++) {
				if (num == i) {
					res++;
				} else if (num % i == 0) {
					res = num % i;
					break;
				}
			}

			switch (res) {
			case 0:
				System.out.println(num + " não é primo!");
				break;
			default:
				System.out.println(num + " é primo!");
				break;
			}
			
		} else {
			System.out.println("Número inválido!");
		}

		scanner.close();
	}
}
