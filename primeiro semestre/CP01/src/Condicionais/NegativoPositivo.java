package Condicionais;

import java.util.Scanner;

public class NegativoPositivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = leitor.nextInt();

        if (numeroDigitado >=0){
            System.out.println("O número digitado é positivo");
        }else {
            System.out.println("O número digitado é negativo");
        }
    }
}
