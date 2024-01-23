import javax.swing.JOptionPane;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		double num1 = Double.parseDouble(JOptionPane.
				showInputDialog("Digite o primeiro número:"));
		
		double num2 = Double.parseDouble(JOptionPane.
				showInputDialog("Digite o segundo número:"));
		
		String sinal = JOptionPane.showInputDialog("Digite o símbolo da operação:");
		
		System.out.print(sinal.equals("+") ? num1 + num2 : ""); // Soma 
		System.out.print(sinal.equals("-") ? num1 - num2 : ""); // Subtrai
		System.out.print(sinal.equals("*") ? num1 * num2 : "");	// Multiplica
		System.out.print(sinal.equals("/") ? num1 / num2 : ""); // Divide
		System.out.print(sinal.equals("%") ? num1 % num2 : ""); // Módulo
	}
}
