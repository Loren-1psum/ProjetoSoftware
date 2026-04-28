package entidades;

public class ProdutoVestuario extends Produto {
    private final String tamanho;

    public ProdutoVestuario(int id, String nome, double preco, int quantidade, String tamanho) {
        super(id, nome, preco, quantidade);
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return "Tamanho: " + tamanho;
    }
}