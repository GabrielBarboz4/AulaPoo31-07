package br.com.senai;

import br.com.senai.controller.PessoController;
import br.com.senai.service.PessoaService;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        PessoaService pessoaService = new PessoaService();
        PessoController pessoaController = new PessoController();

        boolean repetir = true;
        Scanner input = new Scanner(System.in);
        int resposta;
        String nome;
        String cpf;
        String email;
        int idade;
        double altura;

        do {
            System.out.println("""
                    --Cadastro de pessoas--

                    1 - Cadastrar Pessoa;
                    2 - Editar pessoa;
                    3 - Listar pessoa;
                    4 - Buscar pessoa;
                    5 - Remover pessoa;
                    6 - Encerrar a aplicação.""");
            resposta = input.nextInt();

            switch (resposta) {

                case 1:
                    System.out.println("CADASTRAMENTO");
                    System.out.println("Informe o nome ");
                    input.nextLine();
                    nome = input.nextLine();
                    System.out.println("Informe o CPF");
                    cpf = input.nextLine();
                    System.out.println("Informe a idade");
                    idade = input.nextInt();
                    System.out.println("Informe o email");
                    input.nextLine();
                    email = input.nextLine();
                    System.out.println("Informe a altura");
                    altura = input.nextDouble();

                    pessoaController.cadastrarPessoa(nome, cpf, email, idade, altura);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("Sistema finalizado!");
                    repetir = false;
                    break;

                default:
                    throw new IllegalStateException("Valor informado é incorreto: " + resposta);
            }
        } while (repetir);

    }
}
