package LacoRepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada: ");
        int numeroEntrada = leitor.nextInt();
        int contador =0;
        while (contador<=10){
            int resultado = contador * numeroEntrada;
            System.out.println(numeroEntrada + " X " + contador + " = " + resultado);
            contador++;
        }

    }
}
