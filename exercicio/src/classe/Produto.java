package classe;

public class Produto {
	
	String nome;
	double valor;
	static double desconto = 0.25;
	
	Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	double precoComDesconto() {
		double res = this.valor - (this.valor * Produto.desconto);
		return res;
	}
}
