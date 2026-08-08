package br.com.fiap.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exemplo01 {
    static void main() {
        String nomeTurma = "1TDSPV";

        //Instancia uma lista do tipo int (set não permite o mesmo valor igual)
        Set<Integer> rmAlunos = new HashSet<>();
        //Adicionar um valor na lista
        rmAlunos.add(573982);
        rmAlunos.add(573982);
        rmAlunos.add(347527);
        rmAlunos.add(24343);

        // size -> metodo que mostra a quantidade de elementos do array
        System.out.println("Quantidade de RMs: " + rmAlunos.size());
        System.out.println("RM do aluno" + rmAlunos);


        //Exibir todos os rms da lista(como HashSet não tem indice utilizo o forEach para percorrer o array)
        for (Integer aluno: rmAlunos){
            System.out.println(aluno);
        }

    }

}
