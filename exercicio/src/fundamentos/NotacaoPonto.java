package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia Z";
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("Z", "senhora");
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Vini".toUpperCase());
		
		String z = "Bom dia Z"
				.replace("Z", "Má")
				.toUpperCase()
				.concat("!!!");
		System.out.println(z);
	}
}
