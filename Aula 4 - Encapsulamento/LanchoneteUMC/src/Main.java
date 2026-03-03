import entidades.Lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lanche x_burguer = new Lanche("X_BURGUER",
                "Pão, Hamburguer, Queijo, Maionese Verde",
                24.9, 10);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----LISTA DE OPÇÕES----");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - ADICONAR NO ESTOQUE");
            System.out.println("3 - INFORMAÇÃO DO LANCHE");
            System.out.println("4 - ALTERAR VALOR");
            System.out.println("5 - ALTERAR DESCRIÇÂO");
            System.out.println("6 - SAIR");
            System.out.println("DIGITE A OPÇÃO DESEJADA");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Quantos lanches você deseja?: ");
                    int quantidade  = sc.nextInt();
                    sc.nextLine();

                    if (x_burguer.decrementaEstoque(quantidade)) {
                        System.out.println("Você pediu" + quantidade + " " +
                                x_burguer.getNome() + "e o valor final, foi de R$ " +
                                x_burguer.valortotal(quantidade));
                    }else {
                        System.out.println("Pedido não realizado!");
                        System.out.println("Quantidade inváida");
                    }
                    break;

                case "2":
                    System.out.println("Quanto deseja adicionar ao estoque?: ");
                    int quantidade2 = sc.nextInt();
                    sc.nextLine();
                     x_burguer.incrementarEstoque(quantidade2);
                    System.out.println("O estoque agora é: " + x_burguer.getEstoque());
                     break;

                case "3":
                    System.out.println(x_burguer.toString());
                    break;

                case  "4":
                    System.out.println("O lanche " + x_burguer.getNome() + "\ncusta " + x_burguer.getValor());
                    System.out.println("Informe o valor do lanche: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    x_burguer.setValor(valor);
                    break;

                case "5":
                    System.out.println("A descrição atual é: " + x_burguer.getDescricao());
                    System.out.println("Insira a nova descrição");
                    String descricao = sc.nextLine();
                    x_burguer.setDescricao(descricao);
                    break;

                default:
                    System.out.println("Informe uma opção válida");

            }
        }
    }
}
        