package br.com.fiap.zoo.model;

public class Animal {
    protected String nome;
    protected int idade;
    protected Habitat habitat;

    public Animal(String nome, int idade, Habitat habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public void emitirSom(){
        System.out.println("Emitindo Som...");
    }
    public String getInfo(){
        return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nTipo de habitat: " + this.habitat.tipo + "\nArea Habitat: " + this.habitat.area;
    }
}
