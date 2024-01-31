package classe.desafio_classes_metodos;

public class Jantar {
	public static void main(String[] args) {
		Comida feijao = new Comida("Feijão", 0.150);
		Comida arroz = new Comida("Arroz", 0.150);
		Comida carne = new Comida("Carne", 0.300);
		
		Pessoa joao = new Pessoa("João", 72);
		System.out.println("Peso antes de comer: "+ joao.peso + " kg");
		joao.comer(feijao);
		joao.comer(arroz);
		joao.comer(carne);
		System.out.println("Peso depois de comer: "+ joao.peso + " kg");
	}
}
