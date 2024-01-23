package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		var x = 33.2;
		double y = 2.4;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 9;
		int b = 5;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // Devolve somente a parte inteira
		System.out.println(a % b); // Devolve o resto da divisão (operador módulo)
		System.out.println((double) a / b); // CAST - conversão de int para double	
	}	
}
