package fundamentos.tiposPrimitivos;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println(s == "2");
		System.out.println(s.equals("2"));
	}
}
