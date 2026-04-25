package br.com.alura.screenmatch.modelos;

public class Titulo {
    //Atributos
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //Getters e Setters
    //Nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Ano de Lançamento
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    //Incluido no Plano
    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    //Duração em minutos
    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Total de avaliações
    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }

    //Métodos
    public void exibeFichaTecnica() {
        System.out.println("Nome do titulo: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    public void avaliacao(double nota) {
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
