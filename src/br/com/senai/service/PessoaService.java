package br.com.senai.service;

import br.com.senai.entity.PessoaEntity;

public class PessoaService {

    PessoaEntity pessoaEntity = new PessoaEntity();

    public void cadastrarPessoa(String nome, String cpf, String email, int idade, double altura) {
        pessoaEntity.nome = nome;
        pessoaEntity.cpf = cpf;
        pessoaEntity.email = email;
        pessoaEntity.idade = idade;
        pessoaEntity.altura = altura;

        System.out.println("Nome: " + pessoaEntity.nome);
        System.out.println("CPF: " + pessoaEntity.cpf);
        System.out.println("E-mail: " + pessoaEntity.email);
        System.out.println("Idade: " + pessoaEntity.idade);
        System.out.println("Altura: " + pessoaEntity.altura);
        System.out.println("----------------------");

        PessoaEntity pessoaEntityGabriel = new PessoaEntity();
        pessoaEntityGabriel.nome = "Gabriel";
        pessoaEntityGabriel.cpf = "09670828970";
        pessoaEntityGabriel.email = "gabriel@gmail.com";
        pessoaEntityGabriel.idade = 24;
        pessoaEntityGabriel.altura = 180;

        System.out.println("Nome: " + pessoaEntityGabriel.nome);
        System.out.println("CPF: " + pessoaEntityGabriel.cpf);
        System.out.println("E-mail: " + pessoaEntityGabriel.email);
        System.out.println("Idade: " + pessoaEntityGabriel.idade);
        System.out.println("Altura: " + pessoaEntityGabriel.altura);
        System.out.println("----------------------");

    }

    public void listarPessoas() {

    }

    public void buscarPessoa() {

    }

    public void editarPessoa() {

    }

    public void removerPessoa() {

    }
}
