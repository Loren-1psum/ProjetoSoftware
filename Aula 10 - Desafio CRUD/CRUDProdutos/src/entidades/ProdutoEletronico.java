public class ProdutoEletronico extends Produto {
    private int garantiaMeses;

    public ProdutoEletronico(int id, String nome, double preco, int quantidade, int garantiaMeses) {
        super(id, nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String getDescricao() {
        return "Garantia: " + garantiaMeses + " meses";
    }
}