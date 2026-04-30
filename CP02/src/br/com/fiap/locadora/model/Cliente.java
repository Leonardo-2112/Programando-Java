package br.com.fiap.locadora.model;

public class Cliente {
    //Atributos
    private String nome;
    private String cpf;
    private String telefone;
    private boolean possuiLocacao = false;

    //Construtor
    public Cliente(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isPossuiLocacao() {
        return possuiLocacao;
    }

    public void setPossuiLocacao(boolean possuiLocacao) {
        this.possuiLocacao = possuiLocacao;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\nCPF: " + getCpf() + "\nTelefone: " +getTelefone() + "\nPossui veículo alugado: " +isPossuiLocacao() + "\n\n";
    }
}
