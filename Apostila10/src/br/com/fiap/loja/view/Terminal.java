package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Eletronico;
import br.com.fiap.loja.model.Produto;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        //criar objeto do tipo eletronico
        Eletronico pc = new Eletronico(5000, "Intel i9", true);
        //Pedir o valor do desconto
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe a % de desconto: ");
        double precoFinal = pc.calcularDesconto(leitor.nextInt());
        System.out.println("Valor final com desconto aplicado " + precoFinal);
        System.out.println("Informe o cupom de desconto: ");
        String cupom = leitor.next() + leitor.nextLine();
        double valorCupom = pc.calcularDesconto(cupom);
        System.out.println("Valor com cupom: " + valorCupom);
        //Exibir valor com desconto

    }
}
