public abstract class Produto {
    protected int id;
    protected String nome;
    protected double preco;
    protected int quantidade;

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