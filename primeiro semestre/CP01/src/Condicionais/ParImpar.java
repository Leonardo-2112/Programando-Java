package Condicionais;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = leitor.nextInt();
        if (numeroDigitado % 2 == 0){
            System.out.println("O número digitado é par");
        } else{
            System.out.println("O número digitado é ímpar");
        }
    }
}
