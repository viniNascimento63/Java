package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class QuadradoCubo {

	public static void main(String[] args) {
		
		double num = Double.parseDouble(JOptionPane
				.showInputDialog("Digite um número:")
				.replace("," , "."));
		
		double quad = Math.pow(num, 2); // num ^ 2
		double cub = Math.pow(num, 3); // num ^ 3 
		
		System.out.printf("O quadrado de %.0f é %.0f, e o cubo de %.0f é %.0f.",
				num, quad, num, cub);
	}
}
