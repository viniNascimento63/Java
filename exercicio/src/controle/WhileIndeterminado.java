package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		boolean condicao = true;
		
		while(condicao) {
			System.out.printf("%nVocê diz: %s%n", palavra);
			if(palavra.equalsIgnoreCase("sair")) {
				condicao = false;
			} else {
				System.out.println("\nDigite uma palavra: ");
				palavra = scanner.next();
			}
		}
		System.out.println("Fim!");
		scanner.close();
		*/
		
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		
		while(!palavra.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			palavra = entrada.nextLine();
		}
		
		System.out.println("FIM!");
		
		entrada.close();
	}
}
