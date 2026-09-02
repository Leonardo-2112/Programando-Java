package br.com.fiap.cp1.model;

import java.time.LocalDate;

/**
 * Classe abstrata que representa os dados comuns a qualquer pessoa do sistema.
 * Não pode ser instanciada diretamente: serve como base para as classes
 * mais específicas (ex.: Aluno), demonstrando o pilar de ABSTRAÇÃO.
 */
public abstract class Pessoa {
    //Atributos
    private String nome;
    private String cpf;
    private String email;
    private LocalDate dataNascimento;

    //Construtores
    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String email, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * Cada subclasse de Pessoa deve informar o seu próprio tipo
     * (ex.: "Aluno", "Professor" etc.). Método abstrato = ABSTRAÇÃO.
     */
    public abstract String getTipo();

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nE-mail: " + email +
                "\nData de Nascimento: " + dataNascimento;
    }
}
