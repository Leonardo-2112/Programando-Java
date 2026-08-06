package br.com.fiap.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exemplo01 {
    static void main() {
        String nomeTurma = "1TDSPV";

        //Instancia uma lista do tipo int
        List<Integer> rmAlunos = new ArrayList<>();
        //Adicionar um valor na lista
        rmAlunos.add(573982);
        // size -> metodo que mostra a quantidade de elementos do array
        System.out.println("Quantidade de RMs: " + rmAlunos.size());
        System.out.println("RM do aluno" + rmAlunos);

    }
}
