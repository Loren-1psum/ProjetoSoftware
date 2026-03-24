package entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Constructor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Método Calcular Estoque
    public double calcularValorEstoque(){
        return (this.preco * this.quantidade);
    }

    //Método toString
    @Override
    public String toString() {
        return " | " + nome + " | " + preco + " | " + quantidade + " | " + calcularValorEstoque() + " | ";
    }

}
