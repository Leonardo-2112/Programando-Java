package br.com.fiap.apostila07.view;

import javax.swing.*;

public class TesteEleitores {
    //Crie uma classe TesteEleitores que leia a idade de 3 pessoas e informa a sua classe eleitoral:
    //não eleitor (abaixo de 16 anos)
    //eleitor obrigatório (entre 18 e 65 anos)
    //eleitor facultativo (16,17, ou maior que 65 anos)
    //Ao final da execução exibir o total de eleitores obrigatórios.
    public static void main(String[] args) {
        int eleitoresObrigatorios = 0;
        for (int i = 1; i<4; i++){
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa "+ i));
            if (idade < 16){
                JOptionPane.showMessageDialog(null, "Não Eleitor");
            } else if (idade>=18 && idade <= 65) {
                JOptionPane.showMessageDialog(null, "Eleitor Obrigatório");
                eleitoresObrigatorios ++;
            }else {
                JOptionPane.showMessageDialog(null, "Eleitor Facultativo");
            }
        }//fim for
        JOptionPane.showMessageDialog(null, eleitoresObrigatorios + " Eleitore(s) Obrigatório(s)");


    }
}
