package fundamentos.tiposPrimitivos;

import java.util.Scanner;

public class DeafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o salário 1: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o salário 2: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o salário 3: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double media = (sal1 + sal2 + sal3) / 3;
		
		System.out.printf("%nA média dos salários é de R$ %.2f", media);
		
		entrada.close();
	}
}
