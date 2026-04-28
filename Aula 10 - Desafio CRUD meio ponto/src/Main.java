import controle.GerenciarProdutos;
import entidades.ProdutoEletronico;

void main() {

    Scanner sc = new Scanner(System.in);
    GerenciarProdutos gp = new GerenciarProdutos();
    int opcao = 0;
    int id = 0;

    while (opcao != 7) {
        try {
            IO.println("\n1 - Registrar Produto Eletrônico");
            IO.println("2 - Registrar Produto Vestuário");
            IO.println("3 - Registrar Produto Alimentício");
            IO.println("4 - Listar");
            IO.println("5 - Atualizar");
            IO.println("6 - Remover");
            IO.println("7 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    IO.print("Nome: ");
                    String nome = sc.next();
                    IO.print("Preço: ");
                    double preco = sc.nextDouble();
                    IO.print("Qtd: ");
                    int qtd = sc.nextInt();
                    IO.print("Garantia: ");
                    int garantia = sc.nextInt();

                    gp.cadastrarProduto(new ProdutoEletronico(id++, nome, preco, qtd, garantia));
                    break;

                case 4:
                    gp.listarProdutos();
                    break;
            }

        } catch (InputMismatchException e) {
            IO.println("Digite valores corretos!");
            sc.nextLine();
        }
    }
}