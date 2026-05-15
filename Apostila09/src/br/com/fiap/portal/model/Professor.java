package br.com.fiap.portal.model;

public class Professor extends Pessoa{
    private double salario;
    private boolean scrumMaster;

    public Professor(String nome, String cpf, int idade, Endereco endereco) {
        super(nome, cpf, idade, endereco);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isScrumMaster() {
        return scrumMaster;
    }

    public void setScrumMaster(boolean scrumMaster) {
        this.scrumMaster = scrumMaster;
    }
}
