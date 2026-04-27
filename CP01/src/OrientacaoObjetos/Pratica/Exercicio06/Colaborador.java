package OrientacaoObjetos.Pratica.Exercicio06;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Colaborador {
    private String nome;
    private String cargo;
    private int nivelAcesso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    public void alterarDados(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o novo Cargo: ");
        cargo = leitor.next() + leitor.nextLine();
        System.out.println("Digite o novo Nivel de Acesso: ");
        nivelAcesso = leitor.nextInt();
    }

    public void exibirDados(){
        System.out.println("==========================\n");
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Nivel de Acesso: " + nivelAcesso);
        System.out.println("\n==========================");
    }

}
