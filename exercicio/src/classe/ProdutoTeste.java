package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3689.99);
	
		var p2 = new Produto("Caneta tinteiro", 389.90);
		
		System.out.println(p1.nome + ": " + p1.valor);
		System.out.println(p2.nome + ": " + p2.valor);
		
		double valorFinal1 = p1.precoComDesconto();
		double valorFinal2 = p2.precoComDesconto();
		
		System.out.println(p1.nome + ": " + valorFinal1 +"\n"+ p2.nome + ": " + valorFinal2);
		
		double mediaCarrinho = (valorFinal1 + valorFinal2) / 2;
		
		System.out.printf("Média do carrinho: R$ %.2f", mediaCarrinho);
	}
}

