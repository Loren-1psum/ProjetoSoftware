import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciarProdutos gp = new GerenciarProdutos();
        int opcao = 0;
        int id = 0;

        while (opcao != 7) {
            try {
                System.out.println("\n1 - Eletrônico");
                System.out.println("2 - Vestuário");
                System.out.println("3 - Alimentício");
                System.out.println("4 - Listar");
                System.out.println("5 - Atualizar");
                System.out.println("6 - Remover");
                System.out.println("7 - Sair");

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Nome: ");
                        String nome = sc.next();
                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();
                        System.out.print("Qtd: ");
                        int qtd = sc.nextInt();
                        System.out.print("Garantia: ");
                        int garantia = sc.nextInt();

                        gp.cadastrarProduto(new ProdutoEletronico(id++, nome, preco, qtd, garantia));
                        break;

                    case 4:
                        gp.listarProdutos();
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Digite valores corretos!");
                sc.nextLine();
            }
        }
    }
}