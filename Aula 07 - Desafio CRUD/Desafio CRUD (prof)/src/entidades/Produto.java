package entidades;

public class Produto {
    private String nome;
    private String cor;
    private String quantidade;
    private double preco;

    public Produto(String nome, String cor, String quantidade, double preco) {
        this.nome = nome;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}


