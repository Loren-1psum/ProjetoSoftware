import entidades.Produto;
import entidades.gerenciarLoja;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        gerenciarLoja obj = new gerenciarLoja();

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("===== MENU DE OPÇÕES=====");
            System.out.println("1 - Cadastrar Produtos");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Atualizar Produtos");
            System.out.println("4 - Remover Produtos");
            System.out.println("5 - Sair");
            String opcao = sc.nextLine();

            switch (opcao){
                case "1" -> {
                    System.out.println("Digite o nome do produto: ");

                    System.out.println("Cor: ");

                    System.out.println("Tamanho: ");

                    System.out.println("Quantidade: ");

                    System.out.println("Valor: ");
                }
                case "2" -> {
                    System.out.println("Listar produtos");

                }
                case "3" -> {
                    System.out.println("Atualizar produto");

                }
                case "4" -> {
                    System.out.println("Remover produto");

                }
                case "5" -> {
                    System.out.println("Saindo...");
                    return;
                }
            }

        }
    }
}

