package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploCondicao {
    public static void main(String[] args) {
        //Ler a quantidade de alunos na sala
        String pessoas = JOptionPane.showInputDialog("Digite a quantidade de pessoas na sala: ");
        int pessoasInt = Integer.parseInt(pessoas);

        //Dizer se é possível aplicar uma prova em dupla
        if (pessoasInt % 2 ==0){
            JOptionPane.showMessageDialog(null,("É possível aplicar a prova em dupla"));
        }else {
            JOptionPane.showMessageDialog(null,("Não é possível aplicar a prova em dupla"));
        }
    }
}
