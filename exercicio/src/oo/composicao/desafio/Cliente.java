package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {
    String nome;
    List<Compra> compras;

    Scanner scan = new Scanner(System.in);

    Cliente(String nome) {
        this(nome, new ArrayList<>());
    }

    Cliente(String nome, ArrayList<Compra> compras) {
        this.nome = nome;
        this.compras = compras;
    }

    public void comprar() {
        System.out.print("Digite o nome do produto que deseja comprar: ");
        String nome = scan.nextLine();

        System.out.print("Digite a quantidade que deseja: ");
        int quantidade = scan.nextInt();

        compras.add(new Compra(new Item(new Produto(nome, 4632.97), quantidade)));
    }

    public double totalizarGastos() {
        double total = 0;

        // Adiciona ao total o valor de cada item em cada compra.
        for (Compra compra: compras) {
            for (Item item: compra.itens) {
                total += item.quantidade * item.produto.preco;
            }
        }

        return total;
    }
}
