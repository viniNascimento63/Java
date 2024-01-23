package fundamentos.tiposPrimitivos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double d = 1; // Conversão implícita inteiro p/ double
		System.out.println(d);
		
		float f = (float) 1.12345678888; // Conversão explícita com perda de informação
											// (CAST)
		System.out.println(f);
		
		int i = 4;
		byte b = (byte) i; // Explícita (CAST)
		System.out.println(b);
		
		double z = 1.9999;
		int y = (int) z; // CAST com perda de informações
		System.out.println(y);
	} 
}
