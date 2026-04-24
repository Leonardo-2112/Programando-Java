package br.com.fiap.apostila08.view;

import javax.swing.*;

public class TesteString {
    public static void main(String[] args) {
        String endereco = JOptionPane.showInputDialog("Digite o endereço: ");

        String endereco1 = JOptionPane.showInputDialog("Digite outro endereço: ");

        //Comparar se endereços são iguais
        //EqualsIgnoreCase -> compara sem diferenciar as letars maiúsculas e minúsculas
        //equals -> compara diferenciando letras maiúsculas das minúsculas
        if (endereco.equals(endereco1)){
            JOptionPane.showMessageDialog(null, "Os endereços são iguais");
        }else {
            JOptionPane.showMessageDialog(null, "Os endereços são diferentes");
        }

        //Quantos caracteres tem o endereço
        JOptionPane.showMessageDialog(null, "O endereço possui: "+endereco.length());

        //Recuperar o caractere da posição 3 de endereço
        JOptionPane.showMessageDialog(null, "O caractere da terceira posição é: " + endereco.charAt(2));


        //Imprimir na vertical
        for (int i = 1; i < endereco1.length(); i++) {
            System.out.println(endereco1.charAt(i));
        }
    }
}
