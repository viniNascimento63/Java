package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        /* ADICIONANDO ELEMENTOS NA FILA */
        /*
        * Offer e Add
        * - Ambos adicionam elementos à fila.
        * Difereças:
        * - offer: Retorna false com a fila cheia.
        * - add: Lança exception com a fila cheia.
        * */
        fila.add("Ana");
        fila.offer("Rafa");
        fila.add("Gabi");
        fila.offer("Lu");

        /* RETORNANDO ELEMENTOS DA FILA */
        /*
         * Peek e Element
         * - Ambos retornam o primeiro elemento da fila.
         * Difereças:
         * - peek: Retorna null com fila vazia.
         * - element: Lança exception com a fila vazia.
         * */
        System.out.println(fila.peek());
        System.out.println(fila.element());

        /* Alguns métodos úteis */
        // fila.size(); // Retorna o tamanho da fila.
        // fila.clear(); // Limpa a fila.
        // fila.isEmpty(); // Retorna um boolean se a fila etá vazia ou não.

        /* REMOVENDO E RETORNANDO ELEMENTOS DA FILA */
        /*
         * Remove e Poll
         * - Ambos removem e retornam o primeiro elemento da fila.
         * Difereças:
         * - remove: Lança exception com a fila vazia.
         * - poll: Retorna null se a fila estiver vazia.
         * */
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        System.out.println(fila.peek());
    }
}
