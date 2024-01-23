package controle.exercíciosFinais;

import java.util.Scanner;

public class Ex007 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int soma = 0;
		
		while (num >= 0) {
			
			System.out.print("Digite um número positivo (ou negativo para sair): ");
			num = scan.nextInt();
			
			if (num < 0) {
				break;
			}
			
			soma += num;
			System.out.println("A soma dos números digitados é: "
					+ soma + "\n");	
		} 
		
		System.out.println("Fim!");
		
		scan.close();
	}
}
