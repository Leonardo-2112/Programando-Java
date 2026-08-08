package br.com.fiap.apostila08.view;

import java.util.Scanner;

public class Vogal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavraInput = leitor.next();

//        palavraInput=palavraInput.replace('a', '*');
//        palavraInput=palavraInput.replace('e', '*');
//        palavraInput=palavraInput.replace('i', '*');
//        palavraInput=palavraInput.replace('o', '*');
//        palavraInput=palavraInput.replace('u', '*');
        String vogais = "aeiouAEIOU";
        for (int i = 0; i < vogais.length(); i++)
            palavraInput = palavraInput.replace(vogais.charAt(i), '*');

        System.out.println(palavraInput);
    }
}
