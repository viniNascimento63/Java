package fundamentos;

public class Wrappers {
	public static void main(String[] args) {

		Byte b = 100;
		Short s = 1000;
		// Integer.parseInt(entrada.next()); // Lê uma String e converte para inteiro
		Integer i = 10000;
		Long l = 100000L;

		System.out.println(b.byteValue() + " - Wrapper do byte");
		System.out.println(s.toString() + " - Wrapper do short");
		System.out.println(i * 2 + " - Wrapper do int");
		System.out.println(l / 3.0 + " - Wrapper do long");
		
		Float f = 124.03F;
		System.out.println(f + " - Wrapper do float");
		Double d = 1234.5678;
		System.out.println(d + " - Wrapper do double");
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo + " - Wrapper do boolean");
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + " - Wrapper do char");
	}
}
