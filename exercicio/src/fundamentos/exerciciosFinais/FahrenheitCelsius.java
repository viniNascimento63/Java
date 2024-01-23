package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class FahrenheitCelsius {

	public static void main(String[] args) {
		
		System.out.println("### "
				+ "Conversor de °F para °C"
				+ " ###");
		
		double grausF = Double.parseDouble(JOptionPane.
				showInputDialog("Digite a temperatura em °F:")
				.replace("," , "."));
		
		final double FORMULA = (grausF - 32) * 5/9;
		
		double grausC = FORMULA;
		
		System.out.printf("%n%.1f °F é igual a %.1f °C.", grausF, grausC);
	}
}