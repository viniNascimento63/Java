package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		
		System.out.println("### "
				+ "Conversor de °C para °F"
				+ " ###");
		
		double grausC = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a temperatura em °C:")
				.replace("," , "."));
		
		final double FORMULA = (grausC * 9/5) + 32;
		
		double grausF = FORMULA;
		
		System.out.printf("%n%.1f °C é igual a %.1f °F.", grausC, grausF);
	}
}
