package Aula04.exercicios02e03;

public class Titulo implements Comparable<Titulo>{
    String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString() {
        return "Titulo: " + nome;
    }
}
