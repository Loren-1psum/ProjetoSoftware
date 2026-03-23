package entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

<<<<<<< Updated upstream
    public Produto(String nome, double preco, int quantidade) {
=======
    public Produto(String nome, double nota1, double nota2) {
>>>>>>> Stashed changes
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNomeString nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return " | " + nome + " | " + preco + " | " + quantidade + " | ";
    }
}