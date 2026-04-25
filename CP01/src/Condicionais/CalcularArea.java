package Condicionais;

import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("1-Calcular a área do quadrado");
        System.out.println("2-Calcular a área de um triângulo");
        System.out.println("Digite a opção desejada: ");
        int opcao = leitor.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Digite o lado do quadrado: ");
                double lado = leitor.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;
            case 2:
                System.out.println("digite a base do triângulo: ");
                double base = leitor.nextDouble();
                System.out.println("Digite a altura do triângulo");
                double altura = leitor.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                System.out.println("A área do triângulo é: " + areaTriangulo);
                break;
            default:
                System.out.println("Opção Inválida. Tente Novamente");
                break;
        }
    }
}
