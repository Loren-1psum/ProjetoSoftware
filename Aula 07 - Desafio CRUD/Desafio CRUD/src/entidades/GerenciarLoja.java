package entidades;

import java.util.ArrayList;

public class GerenciarLoja {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    //Create
    public void adicionarProduto(Produto produto){
        listaProdutos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void listarProdutos() {
        if (listaProdutos.isEmpty()){
            System.out.println("Nenhum produto encontrado!");
        } else{
            System.out.println("| ID | NOME | NOTA1 | NOTA2 | MÉDIA | SITUAÇÃO |");
            for (int i=0; i<listaProdutos.size(); i++) {
                System.out.println("|" + i + listaProdutos.get(i));
            }
        }
    }

    public void alteraInformacoesProduto(int idProduto, String nome, double nota1, double nota2) {

        Produto produto = listaProdutos.get(idProduto);

        produto.setNome(nome);
        produto.setNota1(nota1);
        produto.setNota2(nota2);

        System.out.println("Produto alteraco com sucesso!");
    }

    public void removerProduto(int idProduto) {
        listaProdutos.remove(idProduto);
        System.out.println("Produto removido com sucesso!");
    }
}
