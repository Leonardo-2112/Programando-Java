package br.com.alua.screenmatch.modelos;

//Herença (Filme é um Titulo, ou seja, a classe Filme herda oq tem na classe Titulo)
public class Filme extends Titulo {
    //Atributos
    private String diretor;

    //Getters e Setters
    //Diretor
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
