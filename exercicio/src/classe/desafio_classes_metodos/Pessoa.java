package classe.desafio_classes_metodos;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public double comer(Comida comida) {
		this.peso += comida.peso;
		return this.peso;
	}
}
