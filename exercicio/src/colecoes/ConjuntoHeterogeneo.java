package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoHeterogeneo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        // Adicionando elementos ao conjunto.
        conjunto.add(3.4);      // double -> Double
        conjunto.add(true);     // boolean -> Boolean
        conjunto.add("Teste");
        conjunto.add(1);        // int -> Integer
        conjunto.add('x');      // char -> Character

        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        // Elementos repetidos não são adicionados ao conjunto.
        conjunto.add("Teste");
        conjunto.add('x');

        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        // Removendo itens do conjunto.
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('x'));

        System.out.println("O tamanho do conjunto é: " + conjunto.size());

        // Verificando se o conjunto contém determinado elemento.
        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        // Instanciando conjunto de forma diferente.
        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // UNIÃO de conjuntos.
        //conjunto.addAll(nums);
        //System.out.println(conjunto);

        // INTERSEÇÃO de conjuntos.
        //nums.retainAll(conjunto);
        //System.out.println(nums);

        // Remove todos os elementos do conjunto.
        conjunto.clear();
        System.out.println(conjunto);
    }
}
