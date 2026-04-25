package OrientacaoObjetos.Aula02.model;

public class Aluno {
    //Atributos
    private String nome;
    private double nota;
    private double somaNotas;
    private int quantidadeNotas = 0;

    //Getters e Setters
    //Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Nota
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    //Métodos
    public double calcularMedia(){
        somaNotas = somaNotas + nota;
        quantidadeNotas++;
        double media = somaNotas/quantidadeNotas;
        return media;
    }
}
