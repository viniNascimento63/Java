package controle.exercíciosFinais;

// Verifica se um número está entre 0 e 10 e é par.

import javax.swing.JOptionPane;

public class Ex001 {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog
				("Digite um número entre 0 e 10: "));
		
		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "Entre 0 e 10: SIM\n"
						+ "Número par: SIM");
			} else {
				JOptionPane.showMessageDialog(null, "Entre 0 e 10: SIM\n"
						+ "Número par: NÃO");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Não está entre 0 e 10!");
		}
	}
}
