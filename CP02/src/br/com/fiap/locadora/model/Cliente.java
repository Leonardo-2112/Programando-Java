package br.com.fiap.locadora.model;

public class Cliente {
    //Atributos
    private String nome;
    private String cpf;
    private String telefone;
    private boolean possuiLocacao = false;

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

    //Métodos
    public boolean podeAlugar(){
        if (possuiLocacao){
            return false;
        }else {
            return true;
        }
    }
    public void alugarVeiculo() {
        possuiLocacao = true;
    }

    public void devolverVeiculo() {
        possuiLocacao = false;
    }
}
