package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        // Adicionando mais usuários à lista.
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Manu"));

        // Acessando usuário pelo ÍNDICE da lista.
        System.out.println(lista.get(4));

        // Removendo usuário pelo índice da lista.
        System.out.println("Usuário(a) removido(a): " + lista.remove(4)); // Retorna o objeto exluído (Manu).

        // Removendo usuário da lista a partir de um objeto.
        System.out.println(lista.remove(new Usuario("Bia"))); // Retorna true se excluído.

        // Se a lista contém determinado elemento.
        System.out.println("Contém? " + lista.contains(new Usuario("Lia")));

        // Exibindo todos os usuários da lista.
        System.out.println();
        for (Usuario user: lista) {
            System.out.println("Meu nome é " + user + ".");
        }
    }
}
