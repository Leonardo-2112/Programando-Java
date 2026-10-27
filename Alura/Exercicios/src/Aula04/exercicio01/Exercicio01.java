package Aula04.exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio01 {
    static void main() {
        //Crie uma lista de números inteiros e utilize o método Collections.sort
        //para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.
        List<Integer> listaDeInteiros = new ArrayList<>();
        listaDeInteiros.add(8);
        listaDeInteiros.add(2);
        listaDeInteiros.add(40);

        Collections.sort(listaDeInteiros);
        System.out.println(listaDeInteiros);
    }
}

