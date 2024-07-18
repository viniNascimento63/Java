package colecoes.exerciciosParticulares;

import java.util.Objects;

public class Produto {
    private String sku;
    private String nome;

    public Produto(String sku, String nome) {
        this.sku = sku;
        this.nome = nome;
    }

    // getters e setters


    public String getSku() {
        return sku;
    }

    public String getNome() {
        return nome;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto [sku=" + sku + ", nome=" + nome + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(sku, produto.sku) && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sku, nome);
    }
}
