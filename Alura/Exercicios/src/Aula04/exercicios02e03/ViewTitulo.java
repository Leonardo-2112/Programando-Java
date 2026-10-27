package Aula04.exercicios02e03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ViewTitulo {
    static void main() {
        Titulo titulo1 = new Titulo("O Poderoso Chefão ");
        Titulo titulo2 = new Titulo("O Mágico de Oz");
        Titulo titulo3 = new Titulo("Cidadão Kane");
        Titulo titulo4 = new Titulo("Casablanca");

        List<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(titulo1);
        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        listaDeTitulos.add(titulo4);

        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
    }
}
