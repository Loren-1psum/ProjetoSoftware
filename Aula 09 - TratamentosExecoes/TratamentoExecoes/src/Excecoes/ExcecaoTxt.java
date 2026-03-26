package Excecoes;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecaoTxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        while (true) {
            System.out.println("===SISTEMA CADASTRO===");
            System.out.println("1 - CADASTRAR PESSOA");
            System.out.println("2 - LISTAR PESSOA");
            System.out.println("3 - SAIR DO PROGRAMA");
            System.out.print("Escolha uma opção: ");
            //opcao = sc.nextInt();
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    try {
                        System.out.print("Digite o nome da pessoa: ");
                        String  nome = sc.next();

                        System.out.print("Digite a idade da pessoa: ");
                        int idade = sc.nextInt();
                        sc.nextLine();

                        FileWriter writer = new FileWriter("dados.txt", true);
                        writer.write("Nome: " + nome + "," + idade + "anos" + "\n");
                        writer.close();
                        System.out.println("Dados cadastrados com sucesso!");

                    } catch (IOException e) {
                        System.out.println("Erro ao criar o arquivo");
                        System.out.println("Detalhe: " + e.getMessage());
                    } catch (InputMismatchException e) {
                        System.out.println("Informe um valor numérico");
                        System.out.println("Detalhe: " + e.getMessage());
                    }
                    break;

                case "2":
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader("dados.txt"));
                        String linha;

                        System.out.println("===LISTA DE PESSOAS===");

                        while ((linha = reader.readLine()) != null) {
                            System.out.println(linha);
                        }

                    } catch(FileNotFoundException e) {
                        System.out.println("Arquivo ainda não criado");
                        System.out.println("Detalhe: " + e.getMessage());
                    } catch(IOException e) {
                        System.out.println("Erro ao ler o arquivo");
                        System.out.println("Detalhe: " + e.getMessage());
                    }
                    break;
                case "3":
                    return;
            }
        }
    }
}
