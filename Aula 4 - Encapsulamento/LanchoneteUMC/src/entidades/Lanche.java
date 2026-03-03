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
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.isBlank()){
            System.out.println("Informe uma descrição válida");
        }else {
            this.descricao = descricao;
        }
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            System.out.println("Informe um valor maior que zero!");
        }else {
            this.valor = valor;
            System.out.println("Valor alterado com sucesso!");
        }
    }

    public void incrementarEstoque(int quantidade){
        if (quantidade > 0){
            this.estoque += quantidade;
            verificaDisponivel();
            System.out.println("Estoque atualizado com sucesso!");
        } else {
            System.out.println("valor inválido!");
        }
    }

    /*public boolean setEstoque(int estoque) {
        if (estoque <= 0) {
            System.out.println("Informe um estoque maior que zero!");
            return false;
        } else {
            this.estoque = estoque;
            System.out.println("Estoque alterado com sucesso!");
            System.out.println(this.estoque + getEstoque());
            return true;
        }
    }*/

    public boolean decrementaEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque) {
            this.estoque -= quantidade;
            this.verificaDisponivel();
            return  true;
        }else {
            return  false;
        }
    }


    public double valortotal(int quantidade) {
        return this.valor * quantidade;

    }

    public void verificaDisponivel() {
        this.disponivel = this.estoque > 0;
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