package br.com.fiap.apostila08.view;

import java.util.Scanner;

public class Maiuscula {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String maiusculo = leitor.next();

        System.out.println("Em maiúsculo: " + maiusculo.toUpperCase());
    }
}
