package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        /* --- ADICIONANDO ELEMENTOS NO MAP */

        /*
        *  -- PUT --
        *
        * Isere um novo elemento ou sobrescreve o que já tinha.
        * */
        usuarios.put(1, "Ryan");
        usuarios.put(2, "Rafa");
        usuarios.put(3, "Régis");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println();

        System.out.println(usuarios.keySet()); // Retorna o conjunto da coluna das chaves do map.
        System.out.println();

        System.out.println(usuarios.values()); // Retorna o conjunto da coluna dos valores do map.
        System.out.println();

        System.out.println(usuarios.entrySet()); // Retorna um conjunto das coluna chave e valor.
        System.out.println();

        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Ryan"));
        System.out.println();

        System.out.println(usuarios.get(1));
        System.out.println();

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " => ");
            System.out.println(registro.getValue());
        }
        System.out.println();

        System.out.println(usuarios.remove(4)); // Retorna o valor do elemento removido.
        System.out.println(usuarios.remove(2, "Rafaa")); // Retorna true se elemento removido.
        System.out.println(usuarios.entrySet());
    }
}
