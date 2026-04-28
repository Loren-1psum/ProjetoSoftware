package entidades;

public abstract class Produto {
    public int id;
    public String nome;
    public double preco;
    public int quantidade;

    public Produto(int id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public abstract String getDescricao();

    @Override
    public String toString() {
        return id + " | " + nome + " | " + preco + " | " + quantidade +
                " | " + calcularValorEstoque() + " | " + getDescricao();
    }
}