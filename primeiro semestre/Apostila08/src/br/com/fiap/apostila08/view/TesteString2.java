package br.com.fiap.apostila08.view;

import java.util.Scanner;

public class TesteString2 {
    public static void main(String[] args) {
        //Ler um email
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o email: ");
        String email = leitor.next() + leitor.nextLine();

        //Valida se o e-mail é válido (se tem o @ e .)
        int posicaoArroba = email.indexOf('@');
        //thiago@fiap.com.br -> 6
        //thiago -> -1
        int posicaoPonto = email.indexOf('.');
        if (posicaoArroba != -1 && posicaoPonto != -1) {
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
        }


        //Separar o email do dominio
        //thiago@fiap.com.br -> e = thiago; dominio = fiap.com.br

        //passsa a posição do arroba
        String e = email.substring(0,posicaoArroba);

        //Passa oq vem depois do Arroba(posicaoArroba +1)
        String dominio = email.substring(posicaoArroba +1);

        System.out.println("nome: " + e);
        System.out.println("Domínio: " + dominio);
    }
}
