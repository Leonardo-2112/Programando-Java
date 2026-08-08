package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploCondicaoEncadeada {
    public static void main(String[] args) {
        //Ler a média final do aluno
        String mediaStr = JOptionPane.showInputDialog("Digite a sua média anual: ");
        double media = Double.parseDouble(mediaStr);
        //Dizer o status do aluno
        if (media>=6){
            System.out.println("O aluno está aprovado");
        } else if (media>=4) {
            System.out.println("O aluno está de exame");
        }else {
            System.out.println("O aluno está retido");
        }
    }
}
