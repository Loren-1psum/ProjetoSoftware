package controle;

import entidades.Produto;
import java.util.ArrayList;

public class GerenciarProdutos {
    private final ArrayList<Produto> lista = new ArrayList<>();

    public void cadastrarProduto(Produto p) {
        lista.add(p);
    }

    public void listarProdutos() {
        for (Produto p : lista) {
            System.out.println(p);
        }
    }

    public void removerProduto(int id) {
        lista.removeIf(p -> p.id == id);
    }

    public void atualizarProduto(int id, String nome, double preco, int quantidade) {
        for (Produto p : lista) {
            if (p.id == id) {
                p.nome = nome;
                p.preco = preco;
                p.quantidade = quantidade;
            }
        }
    }

    public ArrayList<Produto> getLista() {
        return lista;
    }
}