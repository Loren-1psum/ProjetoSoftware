package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;



    //Construtor
    public Lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = estoque > 0;
    }

    //Getter



    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }



    @Override
    public String toString() {
        return "Nome: " + nome +
        "\nDescricao:'" + descricao +
        "\nValor: R$" + valor +
        "\nEstoque:" + estoque +
        "\nDisponivel:" + disponivel;
    }
}
