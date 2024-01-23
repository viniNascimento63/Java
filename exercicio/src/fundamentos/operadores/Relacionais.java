package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int x = 97;
		int y = 'a'; // Caractere 'a' repesenta 97 na 
						// tabela unicode.
		
		System.out.println(x == y); // igual
		
		System.out.println(2 > 4); // Operador: maior
		System.out.println(3 < 5); // Operador: menor
		System.out.println(1 >= 1); // Operador: maior igual
		System.out.println(5 <= 2); // Operador: menor igual
		System.out.println(15 != 14); // Operador: diferente
	}
}
