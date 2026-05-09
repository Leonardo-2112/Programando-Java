package br.com.fiap.portal.view;

import br.com.fiap.portal.model.Aluno;
import br.com.fiap.portal.model.Endereco;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        //Ler dados do Aluno
        Scanner leitor = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(leitor.next()+leitor.nextLine());
        System.out.println("Digite o CPF do aluno: ");
        aluno.setCpf(leitor.next() + leitor.nextLine());
        System.out.println("Digite a idade do aluno: ");
        aluno.setIdade(leitor.nextInt());
        System.out.println("Digite o RM do aluno: ");
        aluno.setRm(leitor.nextInt());
        System.out.println("Digite o curso do aluno: ");
        aluno.setCurso(leitor.next() + leitor.nextLine());
        System.out.println("Digite o logradouro do aluno: ");
        String logradouro = leitor.next() + leitor.nextLine();
        System.out.println("Digite o número do logradouro: ");
        String numero = leitor.next() + leitor.nextLine();
        Endereco endereco = new Endereco(logradouro, numero);//Criar construtor na classe Endereço
        //Atribuir endereco no objeto aluno
        aluno.setEndereco(endereco);

        System.out.println("===============FICHA DO ALUNO===============");
        System.out.println("Nome: " + aluno.getNome() + "\nCPF: " + aluno.getCpf() + "\nIdade: " + aluno.getIdade() + "\nRM: " + aluno.getRm() + "\nCurso: " + aluno.getCurso());
        System.out.println("Endereço do aluno: " + aluno.getEndereco().getLogradouro() + ", " + aluno.getEndereco().getNumero());
    }
}
