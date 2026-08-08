package br.com.fiap.view;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
    static void main() {
        //Criar uma lista do nome
        List<String> nomes = new ArrayList<>();
        //Adicionar 2 nomes
        nomes.add("Leonardo");
        nomes.add("Syang");
        //verificar se os nomes existem
        if (nomes.isEmpty()){
            System.out.println("A lista está vazia");
        }else {
            //Exibir a quantidade
            System.out.println("A lista " + nomes.size() + " tem nomes");
        }

        //Validar nome na lista
        System.out.println("Leonardo está na lista? " + nomes.contains("Leonardo"));

        //Recuperar primeiro nome da lista
        System.out.println(nomes.getFirst());

        System.out.println(nomes);

    }
}
