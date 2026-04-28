public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(int id, String nome, double preco, int quantidade, String dataValidade) {
        super(id, nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String getDescricao() {
        return "Validade: " + dataValidade;
    }
}