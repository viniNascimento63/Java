package fundamentos.tiposPrimitivos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro número:");
		
		String valor2 = JOptionPane.showInputDialog
				("Digite o segundo número:");
		
		System.out.println(valor1 + 
				valor2 + " => concatenação dos valores.");
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;
		System.out.println("A soma dos valores é " + soma);
		System.out.println("A média dos valores é " + soma / 2);
	}
}
