package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente julia = new Cliente("Júlia");
        julia.comprar();
        double total = julia.totalizarGastos();
        System.out.println("\nTotal gasto: R$ " + total);
    }
}
