package br.com.fiap.apostila07.view;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("1-Soma");
        System.out.println("2-Subtração");
        System.out.println("3-Multiplicação");
        System.out.println("4-Divisão");

        System.out.println("Digite a opção desejada: ");
        int opcao = leitor.nextInt();

        System.out.println("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = leitor.nextDouble();


        switch (opcao){
            case 1:
                double soma = num1 +num2;
                System.out.println("A soma é: "+ soma);
                break;
            case 2:
                double sub = num1 -num2;
                System.out.println("A subtrção é: "+sub);
                break;
            case 3:
                double mult = num1 * num2;
                System.out.println("A multiplicação é: "+mult);
                break;
            case 4:
                double div = num1/num2;
                if (num2 ==0){
                    System.out.println("Erro! divisão por zero ");
                    break;
                }else {
                System.out.println("A divisão é: "+div);
                break;}
            default:
                System.out.println("Opção Inválida! Digite Novamente");
                break;
        }
    }
}
