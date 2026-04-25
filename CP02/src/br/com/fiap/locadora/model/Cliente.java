package br.com.fiap.locadora.model;

public class Cliente {
    //Atributos
    private String nome;
    private String cpf;
    private String telefone;
    private boolean possuiLocacao;

    //Getters e Setters
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Cpf
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //Telefone
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //Possui Locação
    public boolean isPossuiLocacao() {
        return possuiLocacao;
    }
    public void setPossuiLocacao(boolean possuiLocacao) {
        this.possuiLocacao = possuiLocacao;
    }
}
