package exercicio01.br.com.fiap.model;

public class Aluno {
        private String nome;
        private double nota;
        private int idade;
        private int rm;

    //Construtor
    public Aluno(String nome, double nota, int idade, int rm) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.rm = rm;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }
}
