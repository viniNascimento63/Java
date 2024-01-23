package fundamentos.exerciciosFinais;

import javax.swing.JOptionPane;

public class CalculoIMC {

	public static void main(String[] args) {
		
		System.out.println("###"
				+ " Calculadora IMC"
				+ " (Índice de Massa Corporal)"
				+ " ###");
		
		double altura = Double.parseDouble(JOptionPane
				.showInputDialog("Digite sua altura (m):")
				.replace("," , "."));
		
		double peso = Double.parseDouble(JOptionPane
				.showInputDialog("Digite seu peso (kg):")
				.replace("," , "."));
		
		final double FORMULA = peso / (Math.pow(altura, 2));
		
		double imc = FORMULA;
		
		System.out.printf("%nO seu IMC é %.2f", imc);
	}
}
