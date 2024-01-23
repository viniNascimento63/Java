package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog(
				"Informe um número:");
		
		int num = Integer.parseInt(valor);
		
		if (num % 2 == 0) {
			System.out.println("Número PAR!");
		} else {
			System.out.println("Número ÍMPAR!");
		}
	}
}
