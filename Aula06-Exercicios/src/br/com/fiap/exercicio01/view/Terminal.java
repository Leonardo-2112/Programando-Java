package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Funcionario;
import br.com.fiap.exercicio01.model.Profissao;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Pedir pro usuário inserir valores
        System.out.println("Digite o nome: ");
        String nome = leitor.next() + leitor.nextLine();
        System.out.println("Digite a matrícula: ");
        long matricula = leitor.nextLong();
        System.out.println("Digite seu salário: ");
        double salario = leitor.nextDouble();
        System.out.println("Digite sua profissão: ");
        String nomeProfissao = leitor.next() + leitor.nextLine();


        //Instanciar a classe Profissao e Funcionario
        Funcionario funcionario = new Funcionario(matricula, nome, new Profissao(nomeProfissao));
        funcionario.setSalario(salario);

        //Exibir os dados (chamando o metodo exibirDados)
        System.out.println(funcionario.exibirDados());
    }
}
