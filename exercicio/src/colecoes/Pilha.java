package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        /* --- ADICIONANDO ELEMENTOS NA PILHA --- */

        /*
        *  --- ADDFIRST ---
        *
        * Adiciona um elemento no topo da pilha.
        * Lança EXCEÇÃO se pilha cheia.
        * */
        livros.addFirst("O Hobbit"); // Lança exceção caso pilha cheia..

        /*
         *  --- PUSH ---
         *
         * Adiciona um elemento no topo da pilha.
         * Lança EXCEÇÃO se pilha cheia.
         * */
        livros.push("O Senhor dos Anéis: A Sociedade do Anel");
        livros.push("As Crônicas de Nárnia");

        /* --- SELECIONANDO ELEMENTOS DA PILHA --- */

        /*
        *  --- PEEK ---
        *
        * Retorna o primeiro elemento da pilha, mas não remove.
        * Retorna NULL se pilha vazia.
        * */
        System.out.println(livros.peek());

        /*
        *  --- GETFIRST ---
        *
        * Retorna o primeiro elemento da pilha, mas não remove.
        * Lança EXCEÇÃO caso pilha vazia.
        * */
        System.out.println(livros.getFirst());

        /* --- REMOVENDO ITENS DA PILHA --- */

        /*
        * --- REMOVEFIRST ---
        *
        * Retorna e remove o primeiro elemento da pilha.
        * Lança EXCEÇÃO se pilha vazia.
        * */
        System.out.println(livros.removeFirst());

        /*
        *  --- POP ---
        *
        * Remove e retorna o primeiro elemento da pilha.
        * Lança EXCEÇÃO se pilha vazia.
        * */
        System.out.println(livros.pop());
    }
}
