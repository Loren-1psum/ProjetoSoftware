package entidades;

import java.util.ArrayList;

public class GerenciarLoja {
    private final ArrayList<Produto> listaProdutos = new ArrayList<>();

    //Create
    public void adicionarProduto(Produto produto){
        listaProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (listaProdutos.isEmpty()){
            System.out.println("Nenhum produto encontrado!");
        } else{
            System.out.println("| ID | NOME | PREÇO | QUANTIDADE | VALOR EM ESTOQUE |");
            for (int i=0; i<listaProdutos.size(); i++) {
                System.out.println("|" + i + listaProdutos.get(i));
            }
        }
    }

    public void alteraInformacoesProduto(int idProduto, String nome, double preco, int quantidade) {

        Produto produto = listaProdutos.get(idProduto);

        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);

        System.out.println("Produto alteraco com sucesso!");
    }

    public void removerProduto(int idProduto) {
        listaProdutos.remove(idProduto);
        System.out.println("Produto removido com sucesso!");
    }
}
