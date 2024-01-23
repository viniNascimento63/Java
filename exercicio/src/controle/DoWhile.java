package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String string = "";
		
		do {
			System.out.print("Digite as palavras mágicas "
					+ "se deseja sair: ");
			string = entrada.nextLine();
		} while (!string.equalsIgnoreCase("por favor"));
		
		System.out.println("\nObrigado!");
		
		entrada.close();
	}
}
