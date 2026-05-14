package br.com.fiap.zoo.model;

public class Mamifero extends Animal {
    private int tempoGestacao;

    public Mamifero(String nome, int idade, Habitat habitat, int tempoGestacao) {
        super(nome, idade, habitat);
        this.tempoGestacao = tempoGestacao;
    }
    public void Amamentar(){
        System.out.println("Amamentando");
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "\nTempo Gestação: " + this.tempoGestacao;
    }
}
