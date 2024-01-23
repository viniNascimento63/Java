package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean tv32 = trabalho1 ^ trabalho2;
		System.out.println("TV de 32? " + tv32);
		
		boolean tv50 = trabalho1 && trabalho2;
		System.out.println("TV de 50? " + tv50);
		
		boolean sorvete = tv50 || tv32;
		System.out.println("Sorvete? " + sorvete);
		
		boolean saudavel = !sorvete;
		System.out.println("Saudável? " + saudavel);
	}
}
