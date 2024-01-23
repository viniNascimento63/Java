package controle.exercíciosFinais;

import java.util.Scanner;

public class Ex008 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite uma palavra qualquer: ");
		String palavra = scan.next();
		
		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		
		scan.close();
	}
}
