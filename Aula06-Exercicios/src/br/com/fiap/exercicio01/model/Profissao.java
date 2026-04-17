package br.com.fiap.exercicio01.model;

public class Profissao {
    //ATRIBUTOS
    private String nome;

    //Construtor padrão (vazio)
    public Profissao(){}
    //Construtor com nome
    public Profissao(String nome){
        this.nome = nome;
    }

    //Getters e Setters
    //NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
