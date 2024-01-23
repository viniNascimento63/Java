package controle.exercíciosFinais;

import java.util.Scanner;

public class Ex009 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int maiorNum = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Digite um número: ");
			int num = scanner.nextInt();
			
			if (num > maiorNum) {
				maiorNum = num;
			}
		}
		
		System.out.println("\n# O maior número digitado foi: " + maiorNum);
		System.out.println("Fim!");
		
		scanner.close();
	}
}
