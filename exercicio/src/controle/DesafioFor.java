package controle;

import java.util.Scanner;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Número da condição por quantidade de letras: ");
		String string = scanner.next();
		
		int palavra = string.length();
		
		for (String valor = "#"; valor.length() <= palavra; valor += "#") {
			System.out.println(valor);
		}
		
		scanner.close();
	}
}
