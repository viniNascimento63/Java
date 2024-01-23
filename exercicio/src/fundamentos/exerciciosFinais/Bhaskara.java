package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class Bhaskara {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor de (a):"));
		
		int b = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor de (b)"));
		
		int c = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor de (c)"));
		
		final int DELTA = (b * b) - (4 * a * c);
		System.out.println("O valor de delta é igual a: " + DELTA);

		System.out.printf("%nEquação obtida: %dx^2 + %dx + %d = 0%n", a, b, c);
		
		double x1 = (-b + Math.sqrt(DELTA)) / 2 * a;
		double x2 = (-b - Math.sqrt(DELTA)) / 2 * a;
		
		System.out.printf("%nAs raízes da equação são: %nx1 = %.0f"
				+ "%nx2 = %.0f", x1, x2);
	}
}