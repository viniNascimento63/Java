package colecoes.exerciciosParticulares;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CadastradorProdutos {
    public static void main(String[] args) {
        HashSet<Produto> produtos = new HashSet<>();

        System.out.println("##### Cadastro de produtos #####");

        try (Scanner entrada = new Scanner(System.in)) {
            String continuar = "s";
            while ("s".equalsIgnoreCase(continuar)) {
                System.out.print("SKU: ");
                String sku = entrada.nextLine();

                System.out.print("\nNome: ");
                String nome = entrada.nextLine();

                Produto produto = new Produto(sku, nome);

                // Verifica se o produto não foi adiconado à lista.
                if (!produtos.contains(produto)) {
                    produtos.add(produto);
                    System.out.println("Produto adicionado.");
                } else {
                    System.err.println("Esse produto já foi adicionado. Utilize outro SKU!");
                }

                System.out.println("Deseja adicionar mais algum produto? (s/n) ");
                continuar = entrada.nextLine();
            }
            produtos.forEach(System.out::println);
            System.out.println("Fim");
        }
    }
}
