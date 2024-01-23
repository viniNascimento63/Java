package fundamentos.tiposPrimitivos;

public class TipoString {
	// EXPERIMENTANDO MÉTODOS STRING =)...
	public static void main(String[] args) {
		String dia = "Bom dia";
		System.out.println(dia.charAt(2)); // Retorna o caractere no índice fornecido

		System.out.println(dia.concat("!!!")); // Retorna uma String concatenada

		System.out.println(dia.contains("Bom")); /*
													 * Retorna verdadeiro/falso se a sequência de caracteres indicados
													 * estiver na String.
													 */

		System.out.println(dia.replace("Bom", "Bao")); // Substitui um ou mais caracteres por outro (s)

		System.out.println(dia.toUpperCase()); // Retorna a String em letras maiúsculas

		System.out.println(
				dia.startsWith("Bao")); /*
										 * Retorna verdadeiro/falso se a String começar com os caracteres informados.
										 */
		System.out.println(dia.length()); /*
											 * Retorna o número de caracteres que ocupa a String, ou seja, seu tamanho.
											 */
		System.out.println(
				dia.equals("bom dia")); /*
										 * Retorna verdadeiro/falso se a String é exatamente igual à sentença informada.
										 */
		System.out
				.println(dia.equalsIgnoreCase("bom dia")); /*
															 * Retorna verdadeiro/falso se a String é igual, não
															 * importando se está em letras maiúsculas ou minúsculas.
															 */

		var nome = "José";
		var sobrenome = "Ferreira";
		var idade = 38;
		var salario = 3450.70;

		// System.out.printf("\nO senhor %s %s tem %d anos e recebe R$ %.2f", nome,
		// sobrenome, idade, salario);

		var frase = String.format("\nO senhor %s %s tem %d anos e recebe R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
