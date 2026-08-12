package br.com.fiap.apostila12.model;

public class Turma {
    private int sala;
    private int quantidadeAlunos;
    private String materia;

    //Métodos
    public void alterarSala(int sala){
        if (sala >= 100 && sala<= 1010){
            this.sala = sala;
        }else {
            throw new RuntimeException("Sala Invalida");
        }
    }

    //Getters e Setters
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }
}
