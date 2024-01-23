package controle.exercíciosFinais;

// Ano bissexto
import javax.swing.JOptionPane;

public class Ex002 {

	public static void main(String[] args) {
		
		int ano = Integer.parseInt(JOptionPane.
				showInputDialog("Digite o ano atual: "));
		
		if (ano > 0) {
			/* É bissexto se:
			 *  for divisível por 4;
			 * 	não for divisível por 100;
			 * 	for divisível por 400.
			 */
			if (ano % 4 == 0 && ((ano % 100 != 0 || ano % 400 == 0))) {
				JOptionPane.
				showInternalMessageDialog(null, ano + " é ano bissexto.");
			} else {
				JOptionPane.
				showInternalMessageDialog(null, ano + " não é ano bissexto.");
			}
		} else {
			JOptionPane.
			showInternalMessageDialog(null, "Valor inválido!");
		}
	}
}
