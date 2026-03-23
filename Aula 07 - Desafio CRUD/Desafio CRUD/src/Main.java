import entidades.Produto;
import entidades.GerenciarLoja;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GerenciarLoja lista = new GerenciarLoja();

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("SISTEMA CRUD DE PRODUTOS");
            System.out.println("1- Cadastrar Produtos");
            System.out.println("2- Listar Produtos");
            System.out.println("3- Alterar Produtos");
            System.out.println("4- Excluir Produtos");
            System.out.println("5- Sair");
            System.out.println("Digite uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao){
                case "1" -> {
                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a nota do produto: ");
                    double nota1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a nota do produto: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Produto produto =new Produto(nome, nota1, nota2);
                    lista.adicionarProduto(produto);
                }
                case "2" -> {
                    lista.listarProdutos();
                }
                case "3" -> {
                    lista.listarProdutos();
                    System.out.println("Digite o ID do produto: ");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a nota do produto: ");
                    double nota1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a nota do produto: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    lista.alteraInformacoesProduto(idProduto, nome, nota1, nota2);
                }
                case "4" -> {
                    lista.listarProdutos();
                    System.out.println("Digite o ID do Produto: ");
                    int idProduto = sc.nextInt();
                    sc.nextLine();

                    lista.removerProduto(idProduto);
                }
                case "5" -> {

                    System.out.println("Saindo do programa...");
                    return;
                }
            }
        }
    }
}
