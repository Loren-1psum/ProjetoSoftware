package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;

    //Construtor


    public Lanche(String nome, String descricao, double valor, int estoque, boolean disponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = disponivel;
    }
}
