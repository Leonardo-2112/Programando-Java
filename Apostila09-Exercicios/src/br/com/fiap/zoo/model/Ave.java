package br.com.fiap.zoo.model;

public class Ave extends Animal{
    public Ave(String nome, int idade, Habitat habitat) {
        super(nome, idade, habitat);
    }
    protected double envergaduraAsa;

    public void voar(){
        System.out.println("VOANDO");
    }
}
