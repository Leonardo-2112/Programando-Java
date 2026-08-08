package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploConversao {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Digite um número: "); // Lê como o scanner mas sempre retorna String
        int n1 = Integer.parseInt(numero1);

        //Ler mais um número
        String numero2 = JOptionPane.showInputDialog("Digite outro número: ");
        int n2 = Integer.parseInt(numero2);

        //Exibir Soma
        JOptionPane.showMessageDialog(null,"A soma é: " + (n1+n2)); //Exibe mensagem igual o sout mas com a caixinha na tela

        byte idade = 18;
        short x = idade;
        //byte y = x; não é possível pois short é maior que o byte

    }
}
