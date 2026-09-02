package br.com.fiap.cp1.model;

import java.time.LocalDate;

/**
 * Aluno é uma especialização de Pessoa (HERANÇA: "extends Pessoa").
 * Além dos dados herdados (nome, cpf, email, dataNascimento), o Aluno
 * possui seus próprios atributos: id (código), curso e estaAtivo.
 */
public class Aluno extends Pessoa {
    //Atributos específicos do Aluno
    private int id;
    private String curso;
    private boolean estaAtivo;

    //Construtores
    public Aluno() {
        super();
    }

    public Aluno(int id, String nome, String cpf, String email, LocalDate dataNascimento, String curso, boolean estaAtivo) {
        super(nome, cpf, email, dataNascimento);
        this.id = id;
        this.curso = curso;
        this.estaAtivo = estaAtivo;
    }

    public Aluno(String nome, String cpf, String email, LocalDate dataNascimento, String curso, boolean estaAtivo) {
        super(nome, cpf, email, dataNascimento);
        this.curso = curso;
        this.estaAtivo = estaAtivo;
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    /**
     * Implementação do método abstrato de Pessoa.
     */
    @Override
    public String getTipo() {
        return "Aluno";
    }

    /**
     * Sobrescreve o toString() herdado de Pessoa e complementa com os
     * dados específicos do Aluno, reaproveitando o comportamento da
     * superclasse através de super.toString() (POLIMORFISMO por
     * sobrescrita de método).
     */
    @Override
    public String toString() {
        return "\n\nCódigo: " + id +
                "\n" + super.toString() +
                "\nCurso: " + curso +
                "\nAluno está ativo?: " + estaAtivo;
    }
}
