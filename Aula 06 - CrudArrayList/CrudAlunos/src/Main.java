import entidades.Aluno;
import entidades.GerenciarListaAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GerenciarListaAlunos lista = new GerenciarListaAlunos();

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("SISTEMA CRUD DE ALUNOS");
            System.out.println("1- Cadastrar Aluno");
            System.out.println("2- Listar Alunos");
            System.out.println("3- Alterar Alunos");
            System.out.println("4- Excluir Alunos");
            System.out.println("5- Sair");
            System.out.println("Digite uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao){
                case "1" -> {
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a nota do aluno: ");
                    double nota1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno =new Aluno(nome, nota1, nota2);
                    lista.adicionarAluno(aluno);
                }
                case "2" -> {
                    lista.listarAlunos();
                }
                case "3" -> {
                    lista.listarAlunos();
                    System.out.println("Digite o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a nota do aluno: ");
                    double nota1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    lista.alteraInformacoesAluno(idAluno, nome, nota1, nota2);
                }
                case "4" -> {
                    lista.listarAlunos();
                    System.out.println("Digite o ID do Aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    lista.removerAluno(idAluno);
                }
                case "5" -> {

                    System.out.println("Saindo do programa...");
                    return;
                }
            }
        }
    }
}
