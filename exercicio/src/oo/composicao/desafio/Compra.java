package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    Compra(Item item) {
        itens.add(item);
    }
}
