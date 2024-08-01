package br.com.senai.controller;

import br.com.senai.service.PessoaService;

public class PessoController {
    PessoaService pessoaService = new PessoaService();

    public void cadastrarPessoa(String nome, String cpf, String email, int idade, double altura) {
        pessoaService.cadastrarPessoa(nome, cpf, email, idade, altura);
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
