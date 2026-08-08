package Aula02;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //crie uma lista de objetos Produto utilizando a classe ArrayList.
        ArrayList <Produto> listaProduto = new ArrayList<>();

        //Adicione alguns produtos, imprima o tamanho da lista
        listaProduto.add(new Produto("Teclado Gamer", 399.90, 1));
        listaProduto.add(new Produto("Monitor Gamer", 1299.99, 1));
        listaProduto.add(new Produto("Mouse Gamer", 299.90, 1));

        //recupere um produto pelo índice.
        System.out.println("Tamanho da Lista: " + listaProduto.size());
        System.out.println("Nome do primeiro Produto: " + listaProduto.get(0).getNome());

        //imprima a lista de produtos utilizando o metodo System.out.println().
        System.out.println(listaProduto);

        //Crie um objeto ProdutoPerecivel
        ArrayList<ProdutoPerecivel> produtosPereciveis = new ArrayList<>();
        produtosPereciveis.add(new ProdutoPerecivel("Queijo", 30, 1, "03/05/2026"));
        produtosPereciveis.add(new ProdutoPerecivel("Carne Bovina", 100, 1, "10/05/2026"));
        produtosPereciveis.add(new ProdutoPerecivel("Iogurte", 15, 1, "08/05/2026"));
        //imprima seus valores.
        System.out.println(produtosPereciveis);

    }
}
