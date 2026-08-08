package OrientacaoObjetos.Pratica.Exercicio05;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void exbirDados(){
        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " +nota1);
        System.out.println("Nota 2: " + nota2);
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " +media);

        if (media>=7){
            System.out.println("O Aluno foi Aprovado");
        }else {
            System.out.println("O Aluno foi Reprovado");
        }
    }
}
