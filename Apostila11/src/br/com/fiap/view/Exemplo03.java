package br.com.fiap.view;

import br.com.fiap.model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class Exemplo03 {
    static void main() {
        //Criar uma lista de veiculos
        List<Veiculo> veiculos = new ArrayList<>();
        //Criar 3 veiculos
        Veiculo pegout = new Veiculo("ABC", 2012, "208");
        Veiculo kwid = new Veiculo("XRS", 2024, "kwid");
        Veiculo renegade = new Veiculo("GDR", 2022, "renagade");
        //Adicionar carros criados na Lista de carros
        veiculos.add(pegout);
        veiculos.add(kwid);
        veiculos.add(renegade);

        //Recuperar segundo veículo da lista e exibir dados
        System.out.println(veiculos.get(1).getModelo());
        System.out.println(veiculos.get(1).getAno());
        System.out.println(veiculos.get(1).getPlaca());
    }
}
