package Condicionais;

import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num1 = leitor.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = leitor.nextInt();

        if (num1 == num2){
            System.out.println("Os números são iguais");
        } else if (num1 > num2) {
            System.out.println("O primeiro número digitado é maior que o segundo");
        }else {
            System.out.println("O segundo número digitado é maior que primeiro");
        }
    }
}
