package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoHomogeneo {
    public static void main(String[] args) {
        // Conjunto de dados homogêneos não ordenados.
        Set<String> listaAprovadosNaoOrdenados = new HashSet<>();
        listaAprovadosNaoOrdenados.add("Ana");
        listaAprovadosNaoOrdenados.add("Carlos");
        listaAprovadosNaoOrdenados.add("Luca");
        listaAprovadosNaoOrdenados.add("Pedro");

        for(String candidato: listaAprovadosNaoOrdenados) {
            System.out.println(candidato);
        }
        System.out.println();
        
        // Conjunto de dados homogêneos ordenados.
        TreeSet<String> listaAprovadosOrdenados = new TreeSet<>();
        listaAprovadosOrdenados.add("Ana");
        listaAprovadosOrdenados.add("Carlos");
        listaAprovadosOrdenados.add("Luca");
        listaAprovadosOrdenados.add("Pedro");

        for(String candidato: listaAprovadosOrdenados) {
            System.out.println(candidato);
        }
    }
}
