package br.com.fiap.zoo.view;

import br.com.fiap.zoo.model.Animal;
import br.com.fiap.zoo.model.Habitat;
import br.com.fiap.zoo.model.Mamifero;

import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        Animal a = new Mamifero("Zebra", 50, new Habitat("abc", 51), 50);
        System.out.println(a.getInfo());
    }

}
