package Aula01;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Leonardo");
        p1.setIdade(18);

        Pessoa p2 = new Pessoa();
        p2.setNome("Beatriz");
        p2.setIdade(23);

        Pessoa p3 = new Pessoa();
        p3.setNome("Andressa");
        p3.setIdade(41);
        //No metodo main da classe Principal, crie um ArrayList de Pessoa chamado listaDePessoas.
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        //Adicione pelo menos três pessoas à lista utilizando o metodo add.
        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);
        //Imprima o tamanho da lista utilizando o metodo size.
        System.out.println(listaDePessoas.size());
        //Imprima a primeira pessoa da lista utilizando o metodo get.
        System.out.println(listaDePessoas.get(0).getNome());
        //Imprima a lista completa
        System.out.println(listaDePessoas);
    }
}
