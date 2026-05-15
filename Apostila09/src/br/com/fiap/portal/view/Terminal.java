package br.com.fiap.portal.view;

import br.com.fiap.portal.model.Aluno;
import br.com.fiap.portal.model.Endereco;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        //Ler dados do Aluno
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o logradouro: ");
        String logradouro = leitor.next() + leitor.nextLine();
        System.out.println("Informe o número: ");
        String numero = leitor.next() + leitor.nextLine();
        Endereco endereco = new Endereco(logradouro, numero);//Criar construtor na classe Endereço
        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.next()+leitor.nextLine();
        System.out.println("Digite o CPF do aluno: ");
        String cpf= leitor.next() + leitor.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = leitor.nextInt();
        System.out.println("Digite o RM do aluno: ");
        int rm = leitor.nextInt();
        System.out.println("Digite o curso do aluno: ");
        String curso = leitor.next() + leitor.nextLine();
        System.out.println("Digite o logradouro do aluno: ");
        Aluno aluno = new Aluno(cpf, nome, idade, endereco, rm, curso);



        //Atribuir endereco no objeto aluno
        //aluno.setEndereco(endereco);

        System.out.println("===============FICHA DO ALUNO===============");
        System.out.println("Nome: " + aluno.getNome() + "\nCPF: " + aluno.getCpf() + "\nIdade: " + aluno.getIdade() + "\nRM: " + aluno.getRm() + "\nCurso: " + aluno.getCurso());
        System.out.println("Endereço do aluno: " + aluno.getEndereco().getLogradouro() + ", " + aluno.getEndereco().getNumero());
    }
}
