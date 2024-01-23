package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.9;
		
		String resParcial = media >= 5.0 ? 
				"em recuperação." : "reprovado(a).";
		String resFinal = media >= 7.0 ? "aprovado(a)." : resParcial;
		
		System.out.println("O(a) aluno(a) está " + resFinal);
	}
}
