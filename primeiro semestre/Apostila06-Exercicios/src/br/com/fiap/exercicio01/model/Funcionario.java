package br.com.fiap.exercicio01.model;

public class Funcionario {
    //ATRIBUTOS
    private String nome;
    private long matricula;
    private Profissao profissao;
    private double salario;


    //CONSTRUTOR PADRÃO (vazio)
    public Funcionario(){}
    //CONSTRUTOR COM MATRÍCULA
    public Funcionario(long matricula){
        this.matricula = matricula;
    }
    //CONSTRUTOR COM MATRÍCULA E NOME
    public Funcionario(long matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }
    //CONSTRUTOR COM MATRÍCULA, NOME E PROFISSÃO
    public Funcionario(long matricula, String nome, Profissao profissao){
        this.matricula = matricula;
        this.nome = nome;
        this.profissao = profissao;
    }

    //METODO
    public String exibirDados(){
        return "Nome: " + nome + ", matrícula: " + matricula + ", salário: " + salario + ", profissão: " + profissao.getNome();
    }


    //GETTERS E SETTERS
    //NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //MATRICULA
    public long getMatricula() {
        return matricula;
    }
    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    //PROFISSÃO
    public Profissao getProfissao() {
        return profissao;
    }
    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    //SALARIO
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
