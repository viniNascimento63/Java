package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();

        compra1.cliente = "Marco Aurélio";
        compra1.adicionarItem("Caixa Caneta BIC azul 1mm 30un", 1, 15.89);
        compra1.adicionarItem("Borracha Pentel 15 un", 1, 14.89);
        compra1.adicionarItem("Caderno 10 Matérias Capa Dura", 2, 22.69);

        System.out.println("Valor total: R$ " + compra1.getTotal());
    }
}
